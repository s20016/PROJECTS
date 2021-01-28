from selenium import webdriver
from selenium.webdriver.chrome.options import Options
import time

PATH = "/mnt/c/WebDrivers/chromedriver.exe"
sampleForm = "https://forms.gle/a8yz9Sjb1mS1DaeN8"

options = Options()
options.add_argument("--window-size=500,700")
web = webdriver.Chrome(executable_path=PATH, options=options)
web.get(sampleForm)

time.sleep(2)

path1 = '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/input'
path2 = '//*[@id="i9"]/div[3]/div'
path3 = '//*[@id="mG61Hd"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/span/div/label[2]/div[2]/div/div/div[3]/div'
submt = '//*[@id="mG61Hd"]/div[2]/div/div[3]/div[3]/div/div/span'

email = "s20016@std.it-college.ac.jp"
web.find_element_by_xpath(path1).send_keys(email)
web.find_element_by_xpath(path2).click()
web.find_element_by_xpath(path3).click()
web.find_element_by_xpath(submt).click()


# Requirements: 
# Selenium Module: $pip3 install selenium
# Chrome Driver:
# 1. Download chromedriver.exe
# 2. Add chromedriver.exe to PATH
# 3. $chmod 755 chromedriver.exe