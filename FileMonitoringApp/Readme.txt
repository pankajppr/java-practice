Create an Directory monitoring app which does the following operations:

. Reads the list of directories at different locations and monitors them for new files addition.
. Update the files details on the database and then keep the status=1 as (created)
. Upload those files or move those files to a remote directory using multiple protocols.
. Updates the status in database to archived i.r status=2
. Consider the scenario for failed or partial upload of the files and update the status=3 (failed)
. return the details to the caller for files details with status

Key Points: 
-Use Hibernate for database transaction
-Use Rest Webservices to interact with the remote or local file system
-use rest webservices to trigger this process
-use spring