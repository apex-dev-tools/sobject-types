/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PermissionSetLicense extends SObject {
	public static SObjectType$<PermissionSetLicense> SObjectType;
	public static SObjectFields$<PermissionSetLicense> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Date ExpirationDate;
	public Id Id;
	public Boolean IsAvailableForIntegrations;
	public Boolean IsDeleted;
	public Boolean IsSupplementLicense;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LicenseExpirationPolicy;
	public String MasterLabel;
	public Boolean MaximumPermissionsAICreateInsightObjects;
	public Boolean MaximumPermissionsAIViewInsightObjects;
	public Boolean MaximumPermissionsAccessCMC;
	public Boolean MaximumPermissionsAccessContentBuilder;
	public Boolean MaximumPermissionsAccessToServiceProcess;
	public Boolean MaximumPermissionsAccountSwitcherUser;
	public Boolean MaximumPermissionsActivateContract;
	public Boolean MaximumPermissionsActivateOrder;
	public Boolean MaximumPermissionsActivitiesAccess;
	public Boolean MaximumPermissionsAddAnalyticsRemoteConnections;
	public Boolean MaximumPermissionsAddDirectMessageMembers;
	public Boolean MaximumPermissionsAddWaveNotificationRecipients;
	public Boolean MaximumPermissionsAllowEmailIC;
	public Boolean MaximumPermissionsAllowLightningLogin;
	public Boolean MaximumPermissionsAllowObjectDetection;
	public Boolean MaximumPermissionsAllowObjectDetectionTraining;
	public Boolean MaximumPermissionsAllowUniversalSearch;
	public Boolean MaximumPermissionsAllowViewEditConvertedLeads;
	public Boolean MaximumPermissionsAllowViewKnowledge;
	public Boolean MaximumPermissionsApexRestServices;
	public Boolean MaximumPermissionsApiEnabled;
	public Boolean MaximumPermissionsApiUserOnly;
	public Boolean MaximumPermissionsAssignPermissionSets;
	public Boolean MaximumPermissionsAssignTopics;
	public Boolean MaximumPermissionsAuthorApex;
	public Boolean MaximumPermissionsAutomaticActivityCapture;
	public Boolean MaximumPermissionsB2BMarketingAnalyticsUser;
	public Boolean MaximumPermissionsBotManageBots;
	public Boolean MaximumPermissionsBotManageBotsTrainingData;
	public Boolean MaximumPermissionsBulkApiHardDelete;
	public Boolean MaximumPermissionsBulkMacrosAllowed;
	public Boolean MaximumPermissionsBypassMFAForUiLogins;
	public Boolean MaximumPermissionsCMSECEAuthoringAccess;
	public Boolean MaximumPermissionsCampaignInfluence2;
	public Boolean MaximumPermissionsCanAccessCE;
	public Boolean MaximumPermissionsCanApproveFeedPost;
	public Boolean MaximumPermissionsCanEditDataPrepRecipe;
	public Boolean MaximumPermissionsCanEditPrompts;
	public Boolean MaximumPermissionsCanInsertFeedSystemFields;
	public Boolean MaximumPermissionsCanManageMaps;
	public Boolean MaximumPermissionsCanUseNewDashboardBuilder;
	public Boolean MaximumPermissionsCanVerifyComment;
	public Boolean MaximumPermissionsChangeDashboardColors;
	public Boolean MaximumPermissionsChatterComposeUiCodesnippet;
	public Boolean MaximumPermissionsChatterEditOwnPost;
	public Boolean MaximumPermissionsChatterEditOwnRecordPost;
	public Boolean MaximumPermissionsChatterFileLink;
	public Boolean MaximumPermissionsChatterInternalUser;
	public Boolean MaximumPermissionsChatterInviteExternalUsers;
	public Boolean MaximumPermissionsChatterOwnGroups;
	public Boolean MaximumPermissionsClientSecretRotation;
	public Boolean MaximumPermissionsCloseConversations;
	public Boolean MaximumPermissionsConfigCustomRecs;
	public Boolean MaximumPermissionsConfigureDataspaceScope;
	public Boolean MaximumPermissionsConfigureScopedAccessGroup;
	public Boolean MaximumPermissionsConnectOrgToEnvironmentHub;
	public Boolean MaximumPermissionsConsentApiUpdate;
	public Boolean MaximumPermissionsContactCenterUserAccess;
	public Boolean MaximumPermissionsContentAdministrator;
	public Boolean MaximumPermissionsContentHubUser;
	public Boolean MaximumPermissionsContentWorkspaces;
	public Boolean MaximumPermissionsConvertLeads;
	public Boolean MaximumPermissionsCreateCustomizeDashboards;
	public Boolean MaximumPermissionsCreateCustomizeFilters;
	public Boolean MaximumPermissionsCreateCustomizeReports;
	public Boolean MaximumPermissionsCreateDashboardFolders;
	public Boolean MaximumPermissionsCreateLtngTempFolder;
	public Boolean MaximumPermissionsCreateLtngTempInPub;
	public Boolean MaximumPermissionsCreatePackaging;
	public Boolean MaximumPermissionsCreateReportFolders;
	public Boolean MaximumPermissionsCreateReportInLightning;
	public Boolean MaximumPermissionsCreateTopics;
	public Boolean MaximumPermissionsCreateWorkBadgeDefinition;
	public Boolean MaximumPermissionsCreateWorkspaces;
	public Boolean MaximumPermissionsCrisisCenterUserAccess;
	public Boolean MaximumPermissionsCustomMobileAppsAccess;
	public Boolean MaximumPermissionsCustomSidebarOnAllPages;
	public Boolean MaximumPermissionsCustomizeApplication;
	public Boolean MaximumPermissionsDataExport;
	public Boolean MaximumPermissionsDelegatedPortalUserAdmin;
	public Boolean MaximumPermissionsDelegatedTwoFactor;
	public Boolean MaximumPermissionsDeleteActivatedContract;
	public Boolean MaximumPermissionsDeleteTopics;
	public Boolean MaximumPermissionsDistributeFromPersWksp;
	public Boolean MaximumPermissionsEditActivatedOrders;
	public Boolean MaximumPermissionsEditBillingInfo;
	public Boolean MaximumPermissionsEditBrandTemplates;
	public Boolean MaximumPermissionsEditCaseComments;
	public Boolean MaximumPermissionsEditEvent;
	public Boolean MaximumPermissionsEditHtmlTemplates;
	public Boolean MaximumPermissionsEditKnowledge;
	public Boolean MaximumPermissionsEditMyDashboards;
	public Boolean MaximumPermissionsEditMyReports;
	public Boolean MaximumPermissionsEditOppLineItemUnitPrice;
	public Boolean MaximumPermissionsEditPublicDocuments;
	public Boolean MaximumPermissionsEditPublicFilters;
	public Boolean MaximumPermissionsEditPublicTemplates;
	public Boolean MaximumPermissionsEditReadonlyFields;
	public Boolean MaximumPermissionsEditTask;
	public Boolean MaximumPermissionsEditTopics;
	public Boolean MaximumPermissionsEmailAdministration;
	public Boolean MaximumPermissionsEmailMass;
	public Boolean MaximumPermissionsEmailSingle;
	public Boolean MaximumPermissionsEmailTemplateManagement;
	public Boolean MaximumPermissionsEnableBCTransactionPolling;
	public Boolean MaximumPermissionsEnableCommunityAppLauncher;
	public Boolean MaximumPermissionsEnableIPFSUpload;
	public Boolean MaximumPermissionsEnableNotifications;
	public Boolean MaximumPermissionsExportReport;
	public Boolean MaximumPermissionsFSCArcGraphCommunityUser;
	public Boolean MaximumPermissionsFeedPinning;
	public Boolean MaximumPermissionsFieldServiceAccess;
	public Boolean MaximumPermissionsFieldServiceDispatcher;
	public Boolean MaximumPermissionsFieldServiceLastMile;
	public Boolean MaximumPermissionsFieldServiceMobileApp;
	public Boolean MaximumPermissionsFieldServiceScheduling;
	public Boolean MaximumPermissionsFlowUFLRequired;
	public Boolean MaximumPermissionsForceTwoFactor;
	public Boolean MaximumPermissionsGiveRecognitionBadge;
	public Boolean MaximumPermissionsGovernNetworks;
	public Boolean MaximumPermissionsHasUnlimitedNBAExecutions;
	public Boolean MaximumPermissionsHeadlessCMSAccess;
	public Boolean MaximumPermissionsHideReadByList;
	public Boolean MaximumPermissionsIdentityConnect;
	public Boolean MaximumPermissionsIdentityEnabled;
	public Boolean MaximumPermissionsImportCustomObjects;
	public Boolean MaximumPermissionsImportLeads;
	public Boolean MaximumPermissionsImportPersonal;
	public Boolean MaximumPermissionsInsightsAppAdmin;
	public Boolean MaximumPermissionsInsightsAppDashboardEditor;
	public Boolean MaximumPermissionsInsightsAppEltEditor;
	public Boolean MaximumPermissionsInsightsAppUploadUser;
	public Boolean MaximumPermissionsInsightsAppUser;
	public Boolean MaximumPermissionsInsightsCreateApplication;
	public Boolean MaximumPermissionsInstallPackaging;
	public Boolean MaximumPermissionsInsuranceGroupBenefitsUser;
	public Boolean MaximumPermissionsIotUser;
	public Boolean MaximumPermissionsIsSsoEnabled;
	public Boolean MaximumPermissionsIsotopeAccess;
	public Boolean MaximumPermissionsIsotopeCToCUser;
	public Boolean MaximumPermissionsIsotopeLEX;
	public Boolean MaximumPermissionsLMEndMessagingSessionUserPerm;
	public Boolean MaximumPermissionsLMOutboundMessagingUserPerm;
	public Boolean MaximumPermissionsLearningManager;
	public Boolean MaximumPermissionsLifecycleManagementAPIUser;
	public Boolean MaximumPermissionsLightningConsoleAllowedForUser;
	public Boolean MaximumPermissionsLightningExperienceUser;
	public Boolean MaximumPermissionsLightningOnFSMobile;
	public Boolean MaximumPermissionsListEmailSend;
	public Boolean MaximumPermissionsLtngPromoReserved01UserPerm;
	public Boolean MaximumPermissionsManageAnalyticSnapshots;
	public Boolean MaximumPermissionsManageAuthProviders;
	public Boolean MaximumPermissionsManageBusinessHourHolidays;
	public Boolean MaximumPermissionsManageC2CHighVolumePriming;
	public Boolean MaximumPermissionsManageC360AConnections;
	public Boolean MaximumPermissionsManageCMS;
	public Boolean MaximumPermissionsManageCallCenters;
	public Boolean MaximumPermissionsManageCases;
	public Boolean MaximumPermissionsManageCategories;
	public Boolean MaximumPermissionsManageCertificates;
	public Boolean MaximumPermissionsManageChatterMessages;
	public Boolean MaximumPermissionsManageContentPermissions;
	public Boolean MaximumPermissionsManageContentProperties;
	public Boolean MaximumPermissionsManageContentTypes;
	public Boolean MaximumPermissionsManageConvMiningReports;
	public Boolean MaximumPermissionsManageCssUsers;
	public Boolean MaximumPermissionsManageCustomPermissions;
	public Boolean MaximumPermissionsManageCustomReportTypes;
	public Boolean MaximumPermissionsManageDashbdsInPubFolders;
	public Boolean MaximumPermissionsManageDataCategories;
	public Boolean MaximumPermissionsManageDataIntegrations;
	public Boolean MaximumPermissionsManageDataspaceScope;
	public Boolean MaximumPermissionsManageDynamicDashboards;
	public Boolean MaximumPermissionsManageEmailClientConfig;
	public Boolean MaximumPermissionsManageEncryptionKeys;
	public Boolean MaximumPermissionsManageEntitlements;
	public Boolean MaximumPermissionsManageExchangeConfig;
	public Boolean MaximumPermissionsManageExternalConnections;
	public Boolean MaximumPermissionsManageHealthCheck;
	public Boolean MaximumPermissionsManageHubConnections;
	public Boolean MaximumPermissionsManageInteraction;
	public Boolean MaximumPermissionsManageInternalUsers;
	public Boolean MaximumPermissionsManageIpAddresses;
	public Boolean MaximumPermissionsManageKnowledge;
	public Boolean MaximumPermissionsManageKnowledgeImportExport;
	public Boolean MaximumPermissionsManageLeads;
	public Boolean MaximumPermissionsManageLearningReporting;
	public Boolean MaximumPermissionsManageLoginAccessPolicies;
	public Boolean MaximumPermissionsManageMobile;
	public Boolean MaximumPermissionsManageNetworks;
	public Boolean MaximumPermissionsManageOrchInstsAndWorkItems;
	public Boolean MaximumPermissionsManagePartners;
	public Boolean MaximumPermissionsManagePasswordPolicies;
	public Boolean MaximumPermissionsManageProfilesPermissionsets;
	public Boolean MaximumPermissionsManagePropositions;
	public Boolean MaximumPermissionsManagePvtRptsAndDashbds;
	public Boolean MaximumPermissionsManageQuotas;
	public Boolean MaximumPermissionsManageRecommendationStrategies;
	public Boolean MaximumPermissionsManageReleaseUpdates;
	public Boolean MaximumPermissionsManageRemoteAccess;
	public Boolean MaximumPermissionsManageReportsInPubFolders;
	public Boolean MaximumPermissionsManageRoles;
	public Boolean MaximumPermissionsManageScopedAccessGroup;
	public Boolean MaximumPermissionsManageSearchPromotionRules;
	public Boolean MaximumPermissionsManageSecurityCommandCenter;
	public Boolean MaximumPermissionsManageSessionPermissionSets;
	public Boolean MaximumPermissionsManageSharing;
	public Boolean MaximumPermissionsManageSolutions;
	public Boolean MaximumPermissionsManageSubscriptions;
	public Boolean MaximumPermissionsManageSurveys;
	public Boolean MaximumPermissionsManageSynonyms;
	public Boolean MaximumPermissionsManageTemplatedApp;
	public Boolean MaximumPermissionsManageTerritories;
	public Boolean MaximumPermissionsManageTranslation;
	public Boolean MaximumPermissionsManageTwoFactor;
	public Boolean MaximumPermissionsManageUnlistedGroups;
	public Boolean MaximumPermissionsManageUsers;
	public Boolean MaximumPermissionsMassInlineEdit;
	public Boolean MaximumPermissionsMergeTopics;
	public Boolean MaximumPermissionsMicrobatching;
	public Boolean MaximumPermissionsModerateChatter;
	public Boolean MaximumPermissionsModerateNetworkFeeds;
	public Boolean MaximumPermissionsModerateNetworkFiles;
	public Boolean MaximumPermissionsModerateNetworkMessages;
	public Boolean MaximumPermissionsModerateNetworkUsers;
	public Boolean MaximumPermissionsModifyAllData;
	public Boolean MaximumPermissionsModifyDataClassification;
	public Boolean MaximumPermissionsModifyMetadata;
	public Boolean MaximumPermissionsMultiStepSchedulingUser;
	public Boolean MaximumPermissionsNativeWebviewScrolling;
	public Boolean MaximumPermissionsNewReportBuilder;
	public Boolean MaximumPermissionsOmnichannelInventorySync;
	public Boolean MaximumPermissionsOptOutGeoLocationTracking;
	public Boolean MaximumPermissionsOverrideForecasts;
	public Boolean MaximumPermissionsPackaging2;
	public Boolean MaximumPermissionsPackaging2Delete;
	public Boolean MaximumPermissionsPackaging2PromoteVersion;
	public Boolean MaximumPermissionsPasswordNeverExpires;
	public Boolean MaximumPermissionsPaymentsAPIUser;
	public Boolean MaximumPermissionsPortalSuperUser;
	public Boolean MaximumPermissionsPreventClassicExperience;
	public Boolean MaximumPermissionsPrivacyDataAccess;
	public Boolean MaximumPermissionsProductAdmin;
	public Boolean MaximumPermissionsPublishPackaging;
	public Boolean MaximumPermissionsQueryAllFiles;
	public Boolean MaximumPermissionsQuipMetricsAccess;
	public Boolean MaximumPermissionsQuipUserEngagementMetrics;
	public Boolean MaximumPermissionsRecordVisibilityAPI;
	public Boolean MaximumPermissionsRemoveDirectMessageMembers;
	public Boolean MaximumPermissionsResetPasswords;
	public Boolean MaximumPermissionsRunFlow;
	public Boolean MaximumPermissionsRunReports;
	public Boolean MaximumPermissionsSalesAnalyticsUser;
	public Boolean MaximumPermissionsSalesConsole;
	public Boolean MaximumPermissionsSandboxTestingInCommunityApp;
	public Boolean MaximumPermissionsScheduleReports;
	public Boolean MaximumPermissionsSelectFilesFromSalesforce;
	public Boolean MaximumPermissionsSendAnnouncementEmails;
	public Boolean MaximumPermissionsSendCustomNotifications;
	public Boolean MaximumPermissionsSendExternalEmailAvailable;
	public Boolean MaximumPermissionsSendSitRequests;
	public Boolean MaximumPermissionsServiceAnalyticsUser;
	public Boolean MaximumPermissionsShareFilesWithNetworks;
	public Boolean MaximumPermissionsShareInternalArticles;
	public Boolean MaximumPermissionsShowCompanyNameAsUserBadge;
	public Boolean MaximumPermissionsSkipIdentityConfirmation;
	public Boolean MaximumPermissionsSolutionImport;
	public Boolean MaximumPermissionsStdAutomaticActivityCapture;
	public Boolean MaximumPermissionsSubmitMacrosAllowed;
	public Boolean MaximumPermissionsSubscribeDashboardRolesGrps;
	public Boolean MaximumPermissionsSubscribeDashboardToOtherUsers;
	public Boolean MaximumPermissionsSubscribeReportRolesGrps;
	public Boolean MaximumPermissionsSubscribeReportToOtherUsers;
	public Boolean MaximumPermissionsSubscribeReportsRunAsUser;
	public Boolean MaximumPermissionsSubscribeToLightningDashboards;
	public Boolean MaximumPermissionsSubscribeToLightningReports;
	public Boolean MaximumPermissionsTraceXdsQueries;
	public Boolean MaximumPermissionsTransactionSecurityExempt;
	public Boolean MaximumPermissionsTransactionalEmailSend;
	public Boolean MaximumPermissionsTransferAnyCase;
	public Boolean MaximumPermissionsTransferAnyEntity;
	public Boolean MaximumPermissionsTransferAnyLead;
	public Boolean MaximumPermissionsTwoFactorApi;
	public Boolean MaximumPermissionsUseAssistantDialog;
	public Boolean MaximumPermissionsUseMySearch;
	public Boolean MaximumPermissionsUseOmnichannelInventoryAPIs;
	public Boolean MaximumPermissionsUseQuerySuggestions;
	public Boolean MaximumPermissionsUseSubscriptionEmails;
	public Boolean MaximumPermissionsUseTeamReassignWizards;
	public Boolean MaximumPermissionsUseTemplatedApp;
	public Boolean MaximumPermissionsUseWebLink;
	public Boolean MaximumPermissionsViewAllActivities;
	public Boolean MaximumPermissionsViewAllCustomSettings;
	public Boolean MaximumPermissionsViewAllData;
	public Boolean MaximumPermissionsViewAllForecasts;
	public Boolean MaximumPermissionsViewAllForeignKeyNames;
	public Boolean MaximumPermissionsViewAllProfiles;
	public Boolean MaximumPermissionsViewAllUsers;
	public Boolean MaximumPermissionsViewAnomalyEvents;
	public Boolean MaximumPermissionsViewContent;
	public Boolean MaximumPermissionsViewCustomerSentiment;
	public Boolean MaximumPermissionsViewDataAssessment;
	public Boolean MaximumPermissionsViewDataCategories;
	public Boolean MaximumPermissionsViewDataLeakageEvents;
	public Boolean MaximumPermissionsViewDeveloperName;
	public Boolean MaximumPermissionsViewEncryptedData;
	public Boolean MaximumPermissionsViewEventLogFiles;
	public Boolean MaximumPermissionsViewGlobalHeader;
	public Boolean MaximumPermissionsViewHealthCheck;
	public Boolean MaximumPermissionsViewHelpLink;
	public Boolean MaximumPermissionsViewMLModels;
	public Boolean MaximumPermissionsViewMyTeamsDashboards;
	public Boolean MaximumPermissionsViewOnlyEmbeddedAppUser;
	public Boolean MaximumPermissionsViewPlatformEvents;
	public Boolean MaximumPermissionsViewPrivateStaticResources;
	public Boolean MaximumPermissionsViewPublicDashboards;
	public Boolean MaximumPermissionsViewPublicReports;
	public Boolean MaximumPermissionsViewRestrictionAndScopingRules;
	public Boolean MaximumPermissionsViewRoles;
	public Boolean MaximumPermissionsViewSecurityCommandCenter;
	public Boolean MaximumPermissionsViewSetup;
	public Boolean MaximumPermissionsViewUserPII;
	public Boolean MaximumPermissionsWaveManagePrivateAssetsUser;
	public Boolean MaximumPermissionsWaveTabularDownload;
	public Boolean MaximumPermissionsWorkCalibrationUser;
	public Boolean MaximumPermissionsWorkDotComUserPerm;
	public Integer MigratableLicenses;
	public String PermissionSetLicenseKey;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TotalLicenses;
	public Integer UsedLicenses;

	public GrantedByLicense[] GrantedByLicenses;
	public PermissionSetLicenseAssign[] PermissionSetLicenseAssignments;

	public PermissionSetLicense clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
