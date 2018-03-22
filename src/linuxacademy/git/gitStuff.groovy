package linuxacademy.git;


def gitComit(gitPath) {

	return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text

}
