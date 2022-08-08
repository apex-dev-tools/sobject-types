/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PermissionSetLicense extends SObject {
	public static SObjectType$<PermissionSetLicense> SObjectType;
	public static SObjectFields$<PermissionSetLicense> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DeveloperName;
	public Date ExpirationDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LicenseExpirationPolicy;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAICreateInsightObjects;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAIViewInsightObjects;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAccessCMC;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAccessContentBuilder;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAccountSwitcherUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsActivateContract;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsActivateOrder;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsActivitiesAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAddAnalyticsRemoteConnections;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAddDirectMessageMembers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAddWaveNotificationRecipients;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAllowEmailIC;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAllowLightningLogin;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAllowUniversalSearch;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAllowViewEditConvertedLeads;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAllowViewKnowledge;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsApexRestServices;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsApiEnabled;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAssignPermissionSets;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAssignTopics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAuthorApex;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsAutomaticActivityCapture;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsB2BMarketingAnalyticsUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsBotManageBots;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsBotManageBotsTrainingData;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsBulkApiHardDelete;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsBulkMacrosAllowed;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCampaignInfluence2;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanApproveFeedPost;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanEditDataPrepRecipe;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanEditPrompts;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanInsertFeedSystemFields;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanManageMaps;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanUseNewDashboardBuilder;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCanVerifyComment;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChangeDashboardColors;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterComposeUiCodesnippet;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterEditOwnPost;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterEditOwnRecordPost;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterFileLink;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterInternalUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterInviteExternalUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsChatterOwnGroups;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCloseConversations;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsConfigCustomRecs;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsConnectOrgToEnvironmentHub;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsConsentApiUpdate;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsContentAdministrator;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsContentHubUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsContentWorkspaces;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsConvertLeads;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateCustomizeDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateCustomizeFilters;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateCustomizeReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateDashboardFolders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateLtngTempFolder;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateLtngTempInPub;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreatePackaging;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateReportFolders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateReportInLightning;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateTopics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateWorkBadgeDefinition;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCreateWorkspaces;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCustomMobileAppsAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCustomSidebarOnAllPages;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsCustomizeApplication;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsDataExport;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsDelegatedTwoFactor;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsDeleteActivatedContract;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsDeleteTopics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsDistributeFromPersWksp;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditActivatedOrders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditBrandTemplates;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditCaseComments;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditEvent;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditHtmlTemplates;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditKnowledge;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditMyDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditMyReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditOppLineItemUnitPrice;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditPublicDocuments;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditPublicFilters;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditPublicTemplates;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditReadonlyFields;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditTask;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEditTopics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEmailAdministration;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEmailMass;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEmailSingle;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEmailTemplateManagement;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEnableCommunityAppLauncher;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsEnableNotifications;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsExportReport;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFeedPinning;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFieldServiceAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFieldServiceDispatcher;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFieldServiceLastMile;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFieldServiceMobileApp;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFieldServiceScheduling;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsFlowUFLRequired;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsForceTwoFactor;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsGiveRecognitionBadge;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsGovernNetworks;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsHasUnlimitedNBAExecutions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsHeadlessCMSAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsHideReadByList;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIdentityConnect;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIdentityEnabled;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsImportCustomObjects;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsImportLeads;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsImportPersonal;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsAppAdmin;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsAppDashboardEditor;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsAppEltEditor;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsAppUploadUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsAppUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInsightsCreateApplication;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsInstallPackaging;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIotUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIsotopeAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIsotopeCToCUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsIsotopeLEX;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLMEndMessagingSessionUserPerm;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLMOutboundMessagingUserPerm;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLearningManager;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLifecycleManagementAPIUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLightningConsoleAllowedForUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLightningExperienceUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsListEmailSend;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsLtngPromoReserved01UserPerm;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageAnalyticSnapshots;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageAuthProviders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageBusinessHourHolidays;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageC360AConnections;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCMS;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCallCenters;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCases;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCategories;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCertificates;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageChatterMessages;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageContentPermissions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageContentProperties;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageContentTypes;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCustomPermissions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageCustomReportTypes;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageDashbdsInPubFolders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageDataCategories;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageDataIntegrations;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageDynamicDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageEmailClientConfig;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageEncryptionKeys;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageExchangeConfig;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageExternalConnections;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageHealthCheck;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageHubConnections;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageInteraction;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageInternalUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageIpAddresses;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageKnowledge;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageKnowledgeImportExport;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageLeads;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageLearningReporting;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageLoginAccessPolicies;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageMobile;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageNetworks;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManagePasswordPolicies;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageProfilesPermissionsets;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManagePropositions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManagePvtRptsAndDashbds;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageQuotas;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageRecommendationStrategies;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageReleaseUpdates;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageRemoteAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageReportsInPubFolders;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageRoles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSearchPromotionRules;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSecurityCommandCenter;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSessionPermissionSets;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSharing;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSolutions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSubscriptions;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSurveys;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageSynonyms;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageTemplatedApp;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageTerritories;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageTranslation;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageTwoFactor;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageUnlistedGroups;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsManageUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsMassInlineEdit;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsMergeTopics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsModerateChatter;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsModerateNetworkUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsModifyAllData;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsModifyDataClassification;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsModifyMetadata;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsNativeWebviewScrolling;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsNewReportBuilder;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsOmnichannelInventorySync;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsOptOutGeoLocationTracking;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsOverrideForecasts;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPackaging2;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPackaging2Delete;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPackaging2PromoteVersion;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPasswordNeverExpires;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPaymentsAPIUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPreventClassicExperience;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPrivacyDataAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsPublishPackaging;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsQueryAllFiles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsQuipMetricsAccess;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsQuipUserEngagementMetrics;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsRecordVisibilityAPI;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsRemoveDirectMessageMembers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsResetPasswords;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsRunFlow;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsRunReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSalesAnalyticsUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSalesConsole;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSandboxTestingInCommunityApp;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsScheduleReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSelectFilesFromSalesforce;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSendAnnouncementEmails;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSendCustomNotifications;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSendSitRequests;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsServiceAnalyticsUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsShareInternalArticles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsShowCompanyNameAsUserBadge;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSkipIdentityConfirmation;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSolutionImport;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsStdAutomaticActivityCapture;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubmitMacrosAllowed;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeDashboardRolesGrps;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeDashboardToOtherUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeReportRolesGrps;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeReportToOtherUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeReportsRunAsUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeToLightningDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsSubscribeToLightningReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTraceXdsQueries;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTransactionalEmailSend;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTransferAnyCase;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTransferAnyEntity;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTransferAnyLead;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsTwoFactorApi;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsUseOmnichannelInventoryAPIs;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsUseSubscriptionEmails;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsUseTeamReassignWizards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsUseTemplatedApp;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsUseWebLink;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllActivities;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllCustomSettings;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllData;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllForecasts;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllForeignKeyNames;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllProfiles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAllUsers;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewAnomalyEvents;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewContent;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewDataAssessment;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewDataCategories;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewDataLeakageEvents;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewEncryptedData;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewEventLogFiles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewHealthCheck;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewHelpLink;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewMyTeamsDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewOnlyEmbeddedAppUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewPlatformEvents;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewPrivateStaticResources;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewPublicDashboards;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewPublicReports;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewRoles;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewSecurityCommandCenter;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewSetup;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsViewUserPII;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsWaveManagePrivateAssetsUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsWaveTabularDownload;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsWorkCalibrationUser;
	public com.nawforce.runforce.System.Boolean MaximumPermissionsWorkDotComUserPerm;
	public com.nawforce.runforce.System.String PermissionSetLicenseKey;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer TotalLicenses;
	public com.nawforce.runforce.System.Integer UsedLicenses;

	public GrantedByLicense[] GrantedByLicenses;
	public PermissionSetLicenseAssign[] PermissionSetLicenseAssignments;

	public PermissionSetLicense clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetLicense clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
