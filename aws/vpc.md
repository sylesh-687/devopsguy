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
      
