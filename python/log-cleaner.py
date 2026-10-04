def cleanup_temp_files(directory: str, dry_run: bool = True) -> int:
    stale_files = files_older_than_7_days(directory)
    if dry_run:
        print(f"Dry run: {len(stale_files)} files would be removed.")
    else:
        remove_files(stale_files)
        print(f"Removed {len(stale_files)} files.")
    return len(stale_files)

def files_older_than_7_days(directory: str) -> list:
    import os
    import time
     
    target_files = []

    for root, dirs, files in os.walk(directory):
        for file in files:
            file_path=os.path.join(root,file)

            file_mtime = os.stat(file_path).st_mtime

            file_age_in_days= (time.time()-file_mtime) / (24 * 3600)
            if file_age_in_days > 7:
                target_files.append(file_path)
    return target_files


def remove_files(file_list: list):
    import os
    for file in file_list:
        os.remove(file)

def main():
    directory ='/Users/shaileshthakur/code-temp'
    

if __name__=="__main__":
    main()
