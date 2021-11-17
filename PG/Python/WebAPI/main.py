from flask import Flask, jsonify
from flask import request as req

from anime.anime import searchAnime

app = Flask(__name__)


@app.route("/")
def home():
    return "Anime Library"


@app.route("/anime")
def animeIndex():
    title = req.args.get("title")
    return searchAnime(title)


app.run()
