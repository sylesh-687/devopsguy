1. What is IAM?
   - AWS Identity and Access Management is a web service that help you securely control access to AWS resources
   - IAM is a Global Service
   - Allows to assign granular permissions, enabling you to control exactly what actions different users can perform on specific resources
   - Integrates with CloudTrial 
   - Shared Access to your account
   - Granular Permission 
   - Identity Federation 
   - PCI DSS Compliance 

2. How IAM works?
   - AWS identity and access management provides the infra necessary to control authentication and authorization

3. What are the components of IAM request?
   - Action 
   - Resource
   - Principal ( The Person or application that used an entity to send request )
   - Environment Data
   - Resource Data

4. IAM Resouce, IAM Identity, IAM Entity
   - IAM User
   - IAM Group
   - IAM Role 
   - Permission Policy
   - Identity Provider Object

   - IAM User and IAM role are IAM Entity
  
5. What is Principal ?
   - An AWS account root user, IAM User or IAM role that can make a request for action or operation on AWS resource
   - Principal Include human user, worklaods, federated users and assumed roles

   - Federated users are users whose identity and credentials are managed by another identity provider

6. What are IAM Policies?
   - IAM Policies define permission for an action regardless of the method you use to perform that action.

7. Describe IAM Policy Structure
```

  {
    "Version": "",
    "Id": "Indentitier of policy"
    "Statement": [
     {
       "Sid": "Identifier of statement",
       "Effect": "Allow",
       "Principal": {
          "AWS": "AWS Account/AWS User / Role"
        },
       "Action": [
         "s3:GetObject"
      ],
      "Resource": ["arn"]
     }
    ]

  }
```

8. What are the core elements of IAM policy Statement?
   ```
   - Effect
   - Principal
   - Resource
   - Sid
   ```
