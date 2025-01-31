import os

# load the data from a file
def loadBuildingData(file_path: os.path):
    if not file_path.exists():
        raise RuntimeError("Building data file does not exist")
    

if __name__ == "__main__":
    pass