organizationFolder('Protobuild') {
  displayName('Protobuild')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(0)
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('Protobuild')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
    folder / 'projectFactories' / 'org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProjectFactory'(plugin: 'workflow-multibranch@2.16') {
      scriptPath('Jenkinsfile')
    }
  }
}

organizationFolder('RedpointGames') {
  displayName('Redpoint Games')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(0)
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('RedpointGames')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
    folder / 'projectFactories' / 'org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProjectFactory'(plugin: 'workflow-multibranch@2.16') {
      scriptPath('Jenkinsfile')
    }
  }
}

organizationFolder('HiveMP') {
  displayName('HiveMP')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(0)
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('HiveMP')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
    folder / 'projectFactories' / 'org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProjectFactory'(plugin: 'workflow-multibranch@2.16') {
      scriptPath('Jenkinsfile')
    }
  }
}