## 1. System & performance

| Command | What you'll learn |
| :--- | :--- |
| `uptime` | Load average and system uptime |
| `top` | CPU, memory, processes, load |
| `htop` | Interactive process analysis |
| `ps` | Process inspection |
| `vmstat` | CPU, memory, processes, I/O |
| `free` | Memory and swap |
| `sar` | Historical performance analysis |
| `mpstat` | Per-CPU utilization |
| `iostat` | Disk/device performance |
| `pidstat` | Per-process CPU/I/O |
| `dstat` | Combined resource monitoring |


## `uptime` Output — Explanation Table

Example:

```text
$ uptime
11:59  up 6 days, 15:59,  2 users,  load averages: 2.57 1.83 1.92
```

| Output | Meaning | Example |
| :--- | :--- | :--- |
| `11:59` | Current system time | `11:59` |
| `up` | Indicates how long the system has been running | `up 6 days...` |


A useful mental model:

```text
              Load Average
                   |
                   ▼
          +------------------+
          | Compare with CPU |
          |      count       |
          +------------------+
                   |
          +--------+--------+
          |                 |
          ▼                 ▼
     Load < CPUs       Load > CPUs
          |                 |
          ▼                 ▼
     Usually more      Investigate
     capacity available CPU/I/O/etc.
```

