# GIT cheatsheet  

## GIT installation and setting  

### Download and install Git from `https://git-scm.com/download`  

### Create local repository on project folder  

 `$ git init .`  

### Create shared repository  

`git init --bare myapplication`  
`git clone /home/user/.../myapplication myapp`  

### Configure Git settings

`git config --list --local` Configure project setting (.git/config)  
`git config --list --global` Configure all projects setting ($HOME/.gitconfig)  
`git config --list --system` Configure git (/etc/gitconfig)  

### Print repository log  

`git log` or `git log --oneline --graph`  

### Add all files in a recursive way  

`git add .`  

### Confirm changes on local repo  

`git commit -am "MESSAGE"`  
  
### Get remote HEAD to local HEAD

`git pull` (print changes and download them)  
`git fetch` (only print changes)  

### View all branches  

`git branch`  

### Create branch  

`git branch BRANCH_NAME`  
`git branch -b BRANCH_NAME` (switch to new branch)  

### Change the working branch  

`git checkout BRANCH_NAME`  

### Create tags for releases  

`git tag -a vX.X HEAD_OR_COMMIT_ID`  

### Publish changes  

`git push REMOTE_NAME TAG_VERSION`

### Recover files  

`git revert COMMIT_ID`  

### Get git stream status  

`git status`  

### Remove N positions from the HEAD of the working tree  

`git reset --hard HEAD ~N`  

### Compare HEAD local repository and current folder content  

`git diff`  

### Check errors between a good and wrong commit

`git bisect start`  
`git bisect good COMMIT_ID`  
`git bisect bad COMMIT_ID`  

### Gives information about who did any change  

`git blame FILE`

### Download third-part repository  

`git pull origin BRANCH_NAME`  
`git checkout BRANCH_NAME`  

### Merge branch changes and main  

`git merge BRANCH_NAME`
`git rebase BRANCH_NAME`  

### Stop WIP to attend another task to fix an issue -> creates a stack of sandboxes with WIP  

`git stash save "NAME"`(creates the sandbox)  
`git stash list` (view sandboxes)  
`git stash apply` (recover files)  
`git stash clear` (remove all sandboxes)  
`git stash pop` (commit current sandbox and clear the stack)  

### Add specific commits such as patches to current branch  

`git cherry-pick COMMIT_ID`  
`git cherry-pick COMMIT_ID1^..COMMIT_IDN`  

## Local workflow

### 1 - Update to check changes  

`git pull`  
`git fetch`  

### 2 - Change source code  

### 3 - Review  

`git diff`

### 4 - Commit  

`git commit`  

## Forking workflow  

### 1 - Clone 3rd part repository  

`git clone git+ssh:URL`  

### 2 - Change code  

### 3 - Commit and push to my fork  

`git commit`
`git push URL_TO_FORK`  

### 4 - Pull request to production branch trough Github  

## Working with Git-Hooks  

`.git/hooks/*.sample` Modify the Hook file and remove extension to trigger the action  

`.git/hooks/post-receive` this script on server side allows to send e-mail to notify changes  

## Private repository with Docker (Gitea)  

### 1 - Download and install Docker from `https://www.docker.com/products/docker-desktop/`  

### 2 - Create `cocker-compose.yml` with service server info  

### 3 - Up the docker `$ docker-compose up`  

### 4 - Check image on `http://localhost:3000/`  

### 5 - Check current images running type `$ docker ps -a`  

### 6 - Stome an image running `docket stop CONTAINER_ID`  
