CRITICAL_LOG_PATTERNS=["ERROR", "Activity"]
def stream_output(command):
    import subprocess as sp
    process = sp.Popen(
        command,
        stdout=sp.PIPE,
        stderr=sp.STDOUT,
        text=True,
        bufsize=1
    )
    return process.stdout

def detect_anamoly(stream):
    for line in stream:
        for pattern in CRITICAL_LOG_PATTERNS:
            if pattern in line:
                print(f"Anomaly detected: {line.strip()}")
def main():
    stream=stream_output(["log", "stream"])  
    # Example command to list files in long format
    detect_anamoly(stream)

if __name__ == "__main__":
    main()
