import random

from fastapi import FastAPI
from fastapi.responses import HTMLResponse

app = FastAPI()

@app.get("/{name}/")
def oneMillionEuros(name: str):
    
    return HTMLResponse(f"{name}, these users have more than one million euros in the account!")
