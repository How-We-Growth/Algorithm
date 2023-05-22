import shutil
import os


def copy_files(source_folder, destination_folder):
    """소스 폴더의 파일들을 대상 폴더로 복사합니다.

    Args:
        source_folder (str): 복사할 파일이 있는 소스 디렉토리 경로입니다.
        destination_folder (str): 복사된 파일이 위치할 대상 디렉토리 경로입니다.
    """
    file_list = os.listdir(source_folder)

    for file_name in file_list:
        source = os.path.join(source_folder, file_name)
        destination = os.path.join(destination_folder, file_name)

        shutil.copytree(source, destination)


def compare_and_copy_files(source_dir, destination_dir):
    """
    소스 디렉토리와 대상 디렉토리를 비교하고 파일을 복사합니다.

    Args:
        source_dir (str): 복사할 파일이 있는 소스 디렉토리 경로입니다.
        destination_dir (str): 복사된 파일이 위치할 대상 디렉토리 경로입니다.
    """
    for root, _, files in os.walk(source_dir):
        for file in files:
            source_file_path = os.path.join(root)
            destination_file_path = os.path.join(
                destination_dir, os.path.relpath(source_file_path, source_dir))

            if not os.path.exists(destination_file_path):
                shutil.copytree(source_file_path, destination_file_path)
                print(f"파일 {file}이(가) 복사되었습니다.")


if __name__ == "__main__":
    source_folder = 'C:\Project_MB\Algorithm\프로그래머스'
    destination_folder = 'C:\Project_MB\How-We-Growth\Algorithm\myungbin\programmers'
    compare_and_copy_files(source_folder, destination_folder)
