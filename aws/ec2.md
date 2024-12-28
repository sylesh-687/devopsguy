1. What is an EC2 instance?

    - WebService which provides scalable on Demand Compute Capacity
    - EC2 is a Virtual Server/Machine
       - Compute
       - Memory
       - Network 
       - Storage

    - Features of Ec2 are : 
        - Virtual Server
        - AMI's
        - Instance Types
        - EBS
        - Instance Stores
        - Key Pairs
        - Security Groups


2. What is AMI?

  - AMI is Image that provides software that is required to setup and boot Amazon EC2 Instance, Each has block device mapping that specifies block devices to attach , AMI must be compatible with the instance type

  - An AMI is specific to following
    - Region
    - Operating System
    - Processor Architecture
    - Root Device Type 
    - Virtualization Type

  - Characteristics 

    - Region
    - Operating System
    - Processor Architecture
    - Launch Permissions
    - Root Device Type 



         EBS Backed (The root Device for an Instance is launched from AMI is an EBS Volume created from EBS snapshot, Support both Linux and Windows)  
         Instance Store Backed ( The root device is an instance store volume created from template stored in S3, Supports only Linux) 

