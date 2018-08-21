organizationFolder('RedpointGames') {
  displayName('Redpoint Games')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('RedpointGames')
      credentialsId('redpoint-jenkins-oss-organisation-scanning')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'jenkins.scm.impl.trait.WildcardSCMHeadFilterTrait'(plugin: 'scm-api@2.2.7') {
          includes('master')
          excludes('')
        }
      }
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
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('HiveMP')
      credentialsId('redpoint-jenkins-oss-organisation-scanning')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'jenkins.scm.impl.trait.WildcardSCMHeadFilterTrait'(plugin: 'scm-api@2.2.7') {
          includes('master')
          excludes('')
        }
      }
    }
  }
}