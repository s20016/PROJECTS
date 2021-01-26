## **ReactJS**

#### **Deploying React App to Github**

```bash
npx create-react-app <app-name>
cd <app-name>
npm start

# Check React App in http://localhost:3000/
# Create new repository in Github. Copy URL

npm add gh-pages
git add .
git commit -m "Initial Commit"
git remote add origin <URL>
git push -u origin master

# Refresh Repo > Settings > Github Pages > master branch > save

```
```bash
nvim package.json

//... # Add the following lines
"homepage": "http://<username>.github.io/<react-pages>"

"scripts": {
  //...
  "predeploy": "npm run build",
  "deploy": "gh-pages -d build"
}
```

```bash
git add .
git commit -m "Modified Github Pages config."
npm run deploy

# Refresh Repo > Settings > Github Pages > gh-pages branch > save
```
