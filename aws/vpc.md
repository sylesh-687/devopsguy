1. What is AWS VPC?
    - VPC ( Virtual Private Cloud ) is Logically isolated Virtual Network
    - Contains Subnet
    - Components/Features
        - Subnets
        - IP Addressing
        - Routing
        - Gateways and Endpoints
        - Peering Connections
        - Traffic Mirroring
        - Transit Gateways
        - VPC Flow logs
        - VPN Connections

2. What is Subnet?
     - Range of Ip Adress in your VPC
     - Each Subnet must reside entirely in an AZ ( availability zone ) and cannot span zones
     - Each Subnet must be associated with a routetable, which specifies routes for outbound traffic leaving the subnet
     - Types of Subnet
         - Private Subnet ( This Subnet doesnot have direct access to Internet Gateway, Resources in Private Subnet resuire NAT to access Internet )
         - Public Subnet ( This Subnet has direct route to Internet Gateway )
         - VPN-only Subnet ( This subnet has Site to Site VPN Connection through Virtual Private Gateway )
         - Isolated Subnet ( This Subnet has not routes to destination outside VPC )

3. What is IGW ( Internet Gateway ) ?
     - VPC component, that allow communication between your VPC and Internet.
     - It Supports IPv4 and IPv6 traffic
     - It enables the components in public subnet to connect to internet, if the resource has public ip , Similarly resources on internet can intiate connection to the 
       resources in the subnet
     - IGW provides a target in your VPC route table for internet routable traffic
  
4. How to configure Internet Access?
    - Create IGW
    - Attach it to your VPC
    - ADD a route to the subnet route table that directs internet-bound traffice to IGW
    - Ensure the instances in your subnet has public IP
    - Ensure Security Groups and NACL Allow desired internet traffic to flow to and from your instances
  
5. What is ElasticIP?
    - Static IPv4 Address
    - This is allocated to AWS Account and is yours until you release it
    - This is a Public IPv4 Address, Which is reachable from Internet
    - This IP doesnot change over Time
    - Elasitc Ip is region specific and cannot be moved to different region
    - You are charged for all Elastic IP addresses in your account
    - 5 EIPs per region by default
  
6. What is NAT?
   - Network Address Translation Service
   - This is used so that Instances in Private Subnet can connect to services outside your VPC, but external serivces cannot initiate connection to those instances
   - NAT is a method of mapping an IP address space to another by modifying network address information in IP header of packets while they are in transit accross the routing      device
   - NAT is Availablity Zone Specific
   - NAT Supports TCP, UDP, ICMP
   - NAT Support 5Gbps and scales upto 100Gpps
  
7. What are the Advantages of NAT?
    - Allows resources in private Subnet to connect to Internet
    - Enable Communication between overlapping Networks
    - Access your netwok with allowed list of IPS
8. Use Cases of NAT?
    - Logging and Monitoring ( Applications frequently needs to send logs an metrics to external services, using NAT private Instances can communicate to external endpoints without being exposed
    - Database Backups
    - Software updates and patching
    - Security Compliance
    - Outbound Data Transfer 
   - You cannot associate Security Group to NAT
   - Ports used by NAT are 1024–65535
   - You can't route traffic to NAT through VPC peering
  
9. What are VPC Endpoints?
     - VPC endpoints enables customer to privately connect to supported AWS Services by a private Link.
     - VPC endpints are virtual Devices
     - There are two types of VPC endpoints

           - Interface Endpoints
           - Gateway Endpoints

10. What is VPC Peering?
     - VPC peering connection is a networking connection between two VPCs, That enables you to route traffic between them using private IP Address
     - Instances in Either VPC can communicate with each other 

11. Route Table.
     - Route table contains set of rules, called routes, that determines where network traffic for your subnet or gateway is directed
     - Route Priority
   
              - Longest Prefix
              - Static Routes
              - Prefix list routes
              - Propagated routes
    - Route Table Concepts
   
              - Main Route Table
              - Custom Route Table
              - Destination ( The Range of IP Address where you want your traffic to go
              - Target ( The Gateway, Network Interface, or Connection through which to send the traffic
              - Route Table Association ( The association between route table and subnet, IGW, or Virtual Private Gateway )
              - Subnet Route Table ( Route Table that is associated with subnet )
              - Local Route ( Default Route for communication in VPC )
              - Propagation
              - Gateway route table
              - Edge Association
              - Transit Gateway route table
              - Local Gateway route table
      
