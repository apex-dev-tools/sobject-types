/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MutingPermissionSet extends SObject {
	public static SObjectType$<MutingPermissionSet> SObjectType;
	public static SObjectFields$<MutingPermissionSet> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Boolean PermissionsAICreateInsightObjects;
	public Boolean PermissionsAIViewInsightObjects;
	public Boolean PermissionsAccessCMC;
	public Boolean PermissionsAccessContentBuilder;
	public Boolean PermissionsAccessToServiceProcess;
	public Boolean PermissionsAccountSwitcherUser;
	public Boolean PermissionsActivateContract;
	public Boolean PermissionsActivateOrder;
	public Boolean PermissionsActivitiesAccess;
	public Boolean PermissionsAddAnalyticsRemoteConnections;
	public Boolean PermissionsAddDirectMessageMembers;
	public Boolean PermissionsAddWaveNotificationRecipients;
	public Boolean PermissionsAllowEmailIC;
	public Boolean PermissionsAllowLightningLogin;
	public Boolean PermissionsAllowUniversalSearch;
	public Boolean PermissionsAllowViewEditConvertedLeads;
	public Boolean PermissionsAllowViewKnowledge;
	public Boolean PermissionsApexRestServices;
	public Boolean PermissionsApiEnabled;
	public Boolean PermissionsAssignPermissionSets;
	public Boolean PermissionsAssignTopics;
	public Boolean PermissionsAuthorApex;
	public Boolean PermissionsAutomaticActivityCapture;
	public Boolean PermissionsB2BMarketingAnalyticsUser;
	public Boolean PermissionsBotManageBots;
	public Boolean PermissionsBotManageBotsTrainingData;
	public Boolean PermissionsBulkApiHardDelete;
	public Boolean PermissionsBulkMacrosAllowed;
	public Boolean PermissionsBypassMFAForUiLogins;
	public Boolean PermissionsCampaignInfluence2;
	public Boolean PermissionsCanApproveFeedPost;
	public Boolean PermissionsCanEditDataPrepRecipe;
	public Boolean PermissionsCanEditPrompts;
	public Boolean PermissionsCanInsertFeedSystemFields;
	public Boolean PermissionsCanManageMaps;
	public Boolean PermissionsCanUseNewDashboardBuilder;
	public Boolean PermissionsCanVerifyComment;
	public Boolean PermissionsChangeDashboardColors;
	public Boolean PermissionsChatterComposeUiCodesnippet;
	public Boolean PermissionsChatterEditOwnPost;
	public Boolean PermissionsChatterEditOwnRecordPost;
	public Boolean PermissionsChatterFileLink;
	public Boolean PermissionsChatterInternalUser;
	public Boolean PermissionsChatterInviteExternalUsers;
	public Boolean PermissionsChatterOwnGroups;
	public Boolean PermissionsClientSecretRotation;
	public Boolean PermissionsCloseConversations;
	public Boolean PermissionsConfigCustomRecs;
	public Boolean PermissionsConfigureScopedAccessGroup;
	public Boolean PermissionsConnectOrgToEnvironmentHub;
	public Boolean PermissionsConsentApiUpdate;
	public Boolean PermissionsContentAdministrator;
	public Boolean PermissionsContentHubUser;
	public Boolean PermissionsContentWorkspaces;
	public Boolean PermissionsConvertLeads;
	public Boolean PermissionsCreateCustomizeDashboards;
	public Boolean PermissionsCreateCustomizeFilters;
	public Boolean PermissionsCreateCustomizeReports;
	public Boolean PermissionsCreateDashboardFolders;
	public Boolean PermissionsCreateLtngTempFolder;
	public Boolean PermissionsCreateLtngTempInPub;
	public Boolean PermissionsCreatePackaging;
	public Boolean PermissionsCreateReportFolders;
	public Boolean PermissionsCreateReportInLightning;
	public Boolean PermissionsCreateTopics;
	public Boolean PermissionsCreateWorkBadgeDefinition;
	public Boolean PermissionsCreateWorkspaces;
	public Boolean PermissionsCustomMobileAppsAccess;
	public Boolean PermissionsCustomSidebarOnAllPages;
	public Boolean PermissionsCustomizeApplication;
	public Boolean PermissionsDataExport;
	public Boolean PermissionsDelegatedPortalUserAdmin;
	public Boolean PermissionsDelegatedTwoFactor;
	public Boolean PermissionsDeleteActivatedContract;
	public Boolean PermissionsDeleteTopics;
	public Boolean PermissionsDistributeFromPersWksp;
	public Boolean PermissionsEditActivatedOrders;
	public Boolean PermissionsEditBillingInfo;
	public Boolean PermissionsEditBrandTemplates;
	public Boolean PermissionsEditCaseComments;
	public Boolean PermissionsEditEvent;
	public Boolean PermissionsEditHtmlTemplates;
	public Boolean PermissionsEditKnowledge;
	public Boolean PermissionsEditMyDashboards;
	public Boolean PermissionsEditMyReports;
	public Boolean PermissionsEditOppLineItemUnitPrice;
	public Boolean PermissionsEditPublicDocuments;
	public Boolean PermissionsEditPublicFilters;
	public Boolean PermissionsEditPublicTemplates;
	public Boolean PermissionsEditReadonlyFields;
	public Boolean PermissionsEditTask;
	public Boolean PermissionsEditTopics;
	public Boolean PermissionsEmailAdministration;
	public Boolean PermissionsEmailMass;
	public Boolean PermissionsEmailSingle;
	public Boolean PermissionsEmailTemplateManagement;
	public Boolean PermissionsEnableBCTransactionPolling;
	public Boolean PermissionsEnableCommunityAppLauncher;
	public Boolean PermissionsEnableIPFSUpload;
	public Boolean PermissionsEnableNotifications;
	public Boolean PermissionsExportReport;
	public Boolean PermissionsFSCArcGraphCommunityUser;
	public Boolean PermissionsFeedPinning;
	public Boolean PermissionsFieldServiceAccess;
	public Boolean PermissionsFieldServiceDispatcher;
	public Boolean PermissionsFieldServiceLastMile;
	public Boolean PermissionsFieldServiceMobileApp;
	public Boolean PermissionsFieldServiceScheduling;
	public Boolean PermissionsFlowUFLRequired;
	public Boolean PermissionsForceTwoFactor;
	public Boolean PermissionsGiveRecognitionBadge;
	public Boolean PermissionsGovernNetworks;
	public Boolean PermissionsHasUnlimitedNBAExecutions;
	public Boolean PermissionsHeadlessCMSAccess;
	public Boolean PermissionsHideReadByList;
	public Boolean PermissionsIdentityConnect;
	public Boolean PermissionsIdentityEnabled;
	public Boolean PermissionsImportCustomObjects;
	public Boolean PermissionsImportLeads;
	public Boolean PermissionsImportPersonal;
	public Boolean PermissionsInsightsAppAdmin;
	public Boolean PermissionsInsightsAppDashboardEditor;
	public Boolean PermissionsInsightsAppEltEditor;
	public Boolean PermissionsInsightsAppUploadUser;
	public Boolean PermissionsInsightsAppUser;
	public Boolean PermissionsInsightsCreateApplication;
	public Boolean PermissionsInstallPackaging;
	public Boolean PermissionsIotUser;
	public Boolean PermissionsIsotopeAccess;
	public Boolean PermissionsIsotopeCToCUser;
	public Boolean PermissionsIsotopeLEX;
	public Boolean PermissionsLMEndMessagingSessionUserPerm;
	public Boolean PermissionsLMOutboundMessagingUserPerm;
	public Boolean PermissionsLearningManager;
	public Boolean PermissionsLifecycleManagementAPIUser;
	public Boolean PermissionsLightningConsoleAllowedForUser;
	public Boolean PermissionsLightningExperienceUser;
	public Boolean PermissionsListEmailSend;
	public Boolean PermissionsLtngPromoReserved01UserPerm;
	public Boolean PermissionsManageAnalyticSnapshots;
	public Boolean PermissionsManageAuthProviders;
	public Boolean PermissionsManageBusinessHourHolidays;
	public Boolean PermissionsManageC360AConnections;
	public Boolean PermissionsManageCMS;
	public Boolean PermissionsManageCallCenters;
	public Boolean PermissionsManageCases;
	public Boolean PermissionsManageCategories;
	public Boolean PermissionsManageCertificates;
	public Boolean PermissionsManageChatterMessages;
	public Boolean PermissionsManageContentPermissions;
	public Boolean PermissionsManageContentProperties;
	public Boolean PermissionsManageContentTypes;
	public Boolean PermissionsManageCssUsers;
	public Boolean PermissionsManageCustomPermissions;
	public Boolean PermissionsManageCustomReportTypes;
	public Boolean PermissionsManageDashbdsInPubFolders;
	public Boolean PermissionsManageDataCategories;
	public Boolean PermissionsManageDataIntegrations;
	public Boolean PermissionsManageDynamicDashboards;
	public Boolean PermissionsManageEmailClientConfig;
	public Boolean PermissionsManageEncryptionKeys;
	public Boolean PermissionsManageEntitlements;
	public Boolean PermissionsManageExchangeConfig;
	public Boolean PermissionsManageExternalConnections;
	public Boolean PermissionsManageHealthCheck;
	public Boolean PermissionsManageHubConnections;
	public Boolean PermissionsManageInteraction;
	public Boolean PermissionsManageInternalUsers;
	public Boolean PermissionsManageIpAddresses;
	public Boolean PermissionsManageKnowledge;
	public Boolean PermissionsManageKnowledgeImportExport;
	public Boolean PermissionsManageLeads;
	public Boolean PermissionsManageLearningReporting;
	public Boolean PermissionsManageLoginAccessPolicies;
	public Boolean PermissionsManageMobile;
	public Boolean PermissionsManageNetworks;
	public Boolean PermissionsManageOrchInstsAndWorkItems;
	public Boolean PermissionsManagePartners;
	public Boolean PermissionsManagePasswordPolicies;
	public Boolean PermissionsManageProfilesPermissionsets;
	public Boolean PermissionsManagePropositions;
	public Boolean PermissionsManagePvtRptsAndDashbds;
	public Boolean PermissionsManageQuotas;
	public Boolean PermissionsManageRecommendationStrategies;
	public Boolean PermissionsManageReleaseUpdates;
	public Boolean PermissionsManageRemoteAccess;
	public Boolean PermissionsManageReportsInPubFolders;
	public Boolean PermissionsManageRoles;
	public Boolean PermissionsManageScopedAccessGroup;
	public Boolean PermissionsManageSearchPromotionRules;
	public Boolean PermissionsManageSecurityCommandCenter;
	public Boolean PermissionsManageSessionPermissionSets;
	public Boolean PermissionsManageSharing;
	public Boolean PermissionsManageSolutions;
	public Boolean PermissionsManageSubscriptions;
	public Boolean PermissionsManageSurveys;
	public Boolean PermissionsManageSynonyms;
	public Boolean PermissionsManageTemplatedApp;
	public Boolean PermissionsManageTerritories;
	public Boolean PermissionsManageTranslation;
	public Boolean PermissionsManageTwoFactor;
	public Boolean PermissionsManageUnlistedGroups;
	public Boolean PermissionsManageUsers;
	public Boolean PermissionsMassInlineEdit;
	public Boolean PermissionsMergeTopics;
	public Boolean PermissionsMicrobatching;
	public Boolean PermissionsModerateChatter;
	public Boolean PermissionsModerateNetworkFeeds;
	public Boolean PermissionsModerateNetworkFiles;
	public Boolean PermissionsModerateNetworkMessages;
	public Boolean PermissionsModerateNetworkUsers;
	public Boolean PermissionsModifyAllData;
	public Boolean PermissionsModifyDataClassification;
	public Boolean PermissionsModifyMetadata;
	public Boolean PermissionsMultiStepSchedulingUser;
	public Boolean PermissionsNativeWebviewScrolling;
	public Boolean PermissionsNewReportBuilder;
	public Boolean PermissionsOmnichannelInventorySync;
	public Boolean PermissionsOptOutGeoLocationTracking;
	public Boolean PermissionsOverrideForecasts;
	public Boolean PermissionsPackaging2;
	public Boolean PermissionsPackaging2Delete;
	public Boolean PermissionsPackaging2PromoteVersion;
	public Boolean PermissionsPasswordNeverExpires;
	public Boolean PermissionsPaymentsAPIUser;
	public Boolean PermissionsPortalSuperUser;
	public Boolean PermissionsPreventClassicExperience;
	public Boolean PermissionsPrivacyDataAccess;
	public Boolean PermissionsPublishPackaging;
	public Boolean PermissionsQueryAllFiles;
	public Boolean PermissionsQuipMetricsAccess;
	public Boolean PermissionsQuipUserEngagementMetrics;
	public Boolean PermissionsRecordVisibilityAPI;
	public Boolean PermissionsRemoveDirectMessageMembers;
	public Boolean PermissionsResetPasswords;
	public Boolean PermissionsRunFlow;
	public Boolean PermissionsRunReports;
	public Boolean PermissionsSalesAnalyticsUser;
	public Boolean PermissionsSalesConsole;
	public Boolean PermissionsSandboxTestingInCommunityApp;
	public Boolean PermissionsScheduleReports;
	public Boolean PermissionsSelectFilesFromSalesforce;
	public Boolean PermissionsSendAnnouncementEmails;
	public Boolean PermissionsSendCustomNotifications;
	public Boolean PermissionsSendSitRequests;
	public Boolean PermissionsServiceAnalyticsUser;
	public Boolean PermissionsShareFilesWithNetworks;
	public Boolean PermissionsShareInternalArticles;
	public Boolean PermissionsShowCompanyNameAsUserBadge;
	public Boolean PermissionsSkipIdentityConfirmation;
	public Boolean PermissionsSolutionImport;
	public Boolean PermissionsStdAutomaticActivityCapture;
	public Boolean PermissionsSubmitMacrosAllowed;
	public Boolean PermissionsSubscribeDashboardRolesGrps;
	public Boolean PermissionsSubscribeDashboardToOtherUsers;
	public Boolean PermissionsSubscribeReportRolesGrps;
	public Boolean PermissionsSubscribeReportToOtherUsers;
	public Boolean PermissionsSubscribeReportsRunAsUser;
	public Boolean PermissionsSubscribeToLightningDashboards;
	public Boolean PermissionsSubscribeToLightningReports;
	public Boolean PermissionsTraceXdsQueries;
	public Boolean PermissionsTransactionSecurityExempt;
	public Boolean PermissionsTransactionalEmailSend;
	public Boolean PermissionsTransferAnyCase;
	public Boolean PermissionsTransferAnyEntity;
	public Boolean PermissionsTransferAnyLead;
	public Boolean PermissionsTwoFactorApi;
	public Boolean PermissionsUseAssistantDialog;
	public Boolean PermissionsUseMySearch;
	public Boolean PermissionsUseOmnichannelInventoryAPIs;
	public Boolean PermissionsUseQuerySuggestions;
	public Boolean PermissionsUseSubscriptionEmails;
	public Boolean PermissionsUseTeamReassignWizards;
	public Boolean PermissionsUseTemplatedApp;
	public Boolean PermissionsUseWebLink;
	public Boolean PermissionsViewAllActivities;
	public Boolean PermissionsViewAllCustomSettings;
	public Boolean PermissionsViewAllData;
	public Boolean PermissionsViewAllForecasts;
	public Boolean PermissionsViewAllForeignKeyNames;
	public Boolean PermissionsViewAllProfiles;
	public Boolean PermissionsViewAllUsers;
	public Boolean PermissionsViewAnomalyEvents;
	public Boolean PermissionsViewContent;
	public Boolean PermissionsViewCustomerSentiment;
	public Boolean PermissionsViewDataAssessment;
	public Boolean PermissionsViewDataCategories;
	public Boolean PermissionsViewDataLeakageEvents;
	public Boolean PermissionsViewDeveloperName;
	public Boolean PermissionsViewEncryptedData;
	public Boolean PermissionsViewEventLogFiles;
	public Boolean PermissionsViewGlobalHeader;
	public Boolean PermissionsViewHealthCheck;
	public Boolean PermissionsViewHelpLink;
	public Boolean PermissionsViewMLModels;
	public Boolean PermissionsViewMyTeamsDashboards;
	public Boolean PermissionsViewOnlyEmbeddedAppUser;
	public Boolean PermissionsViewPlatformEvents;
	public Boolean PermissionsViewPrivateStaticResources;
	public Boolean PermissionsViewPublicDashboards;
	public Boolean PermissionsViewPublicReports;
	public Boolean PermissionsViewRoles;
	public Boolean PermissionsViewSecurityCommandCenter;
	public Boolean PermissionsViewSetup;
	public Boolean PermissionsViewUserPII;
	public Boolean PermissionsWaveManagePrivateAssetsUser;
	public Boolean PermissionsWaveTabularDownload;
	public Boolean PermissionsWorkCalibrationUser;
	public Boolean PermissionsWorkDotComUserPerm;
	public Datetime SystemModstamp;

	public MutingPermissionSet clone$() {throw new java.lang.UnsupportedOperationException();}
	public MutingPermissionSet clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MutingPermissionSet clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MutingPermissionSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MutingPermissionSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
