1. What is Docker?
   - Docker is OpenSource Platform for developing , shipping and running application.

2. What are containers?
   - Isolated Processes for your app.
   - Running Instance of an Image

3. Container Storage.
   - By default all files created in the container are stored on the writeable layer that sits on top of readonly immutable image layers.
   - Data writtern to the layer doesnot persist, when container is destroyed
   - That means it can be difficult to get the data out of the container 
   - The writeable layer is unique per container,so it is difficult to extract the data from container to host or to another container.

4. Storage Mount Options in Docker?

   ```
      1. Volume Mounts 
      2. Bind Mounts 
      3. tmpfs Mounts 
      4. Named Pipes

		1. Volume Mounts:
                     
                       - These are persistent storage managed by Docker Daemon, They retain data even after  containers using them are removed.
                       - Volume Data are stored in filesystem on host. But inorder to interact with it, it should be mounted to the Container 


		2. Bind Mounts:
                     
		     - Bind Mounts creates direct links between host system path and container, allowing access to files or directories stored anywhere on the host.
                     - Since they are not isolated by Docker, both non docker process on the host and container process can be modify the files simultaneously
		     - Use Bind Mounts when you need to be able to access files from containers and hosts.

		3. tmpfs Mounts:
 		    - 

   ```
