/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class UserPermissionAccess extends SObject {
	public static SObjectType$<UserPermissionAccess> SObjectType;
	public static SObjectFields$<UserPermissionAccess> Fields;

	public Id Id;
	public Datetime LastCacheUpdate;
	public Boolean PermissionsAECommunityAccess;
	public Boolean PermissionsAICreateInsightObjects;
	public Boolean PermissionsAIViewInsightObjects;
	public Boolean PermissionsAccessApplicationFormObjects;
	public Boolean PermissionsAccessBudgetManagement;
	public Boolean PermissionsAccessCMC;
	public Boolean PermissionsAccessContentBuilder;
	public Boolean PermissionsAccessDisputePrompts;
	public Boolean PermissionsAccessFinancialAccounts;
	public Boolean PermissionsAccessServiceEinstein;
	public Boolean PermissionsAccessToComplaintMgmt;
	public Boolean PermissionsAccessToDisputeManagement;
	public Boolean PermissionsAccessToServiceProcess;
	public Boolean PermissionsAccountSwitcherUser;
	public Boolean PermissionsAccountingJobUser;
	public Boolean PermissionsAccountingSubledgerAdmin;
	public Boolean PermissionsAccountingSubledgerStarterUser;
	public Boolean PermissionsActionPlansUserAccess;
	public Boolean PermissionsActionableListCompUser;
	public Boolean PermissionsActionableListConfigUser;
	public Boolean PermissionsActionableListCreator;
	public Boolean PermissionsActionableListUser;
	public Boolean PermissionsActivateContract;
	public Boolean PermissionsActivateOrder;
	public Boolean PermissionsActivateSystemModeFlows;
	public Boolean PermissionsActivitiesAccess;
	public Boolean PermissionsAddAnalyticsRemoteConnections;
	public Boolean PermissionsAddDirectMessageMembers;
	public Boolean PermissionsAddWaveNotificationRecipients;
	public Boolean PermissionsAdoptionAnalyticsUser;
	public Boolean PermissionsAdvancedCsvDataImportUser;
	public Boolean PermissionsAllowAIAccelerator;
	public Boolean PermissionsAllowDCHEnGpt;
	public Boolean PermissionsAllowDCHEnGptAccuracy;
	public Boolean PermissionsAllowDCHEnGptSearch;
	public Boolean PermissionsAllowEmailIC;
	public Boolean PermissionsAllowGnrcDisclsFrmwk;
	public Boolean PermissionsAllowIndustriesCSVDataLoading;
	public Boolean PermissionsAllowLightningLogin;
	public Boolean PermissionsAllowObjectDetection;
	public Boolean PermissionsAllowObjectDetectionTraining;
	public Boolean PermissionsAllowNZCMngEsgPgm;
	public Boolean PermissionsAllowSCBEI;
	public Boolean PermissionsAllowSCCalcAndLock;
	public Boolean PermissionsAllowSCCarbonAccounting;
	public Boolean PermissionsAllowSCCarbonCreditAlloc;
	public Boolean PermissionsAllowSCCmtyExtEngMgmt;
	public Boolean PermissionsAllowSCCreditSync;
	public Boolean PermissionsAllowSCDGF;
	public Boolean PermissionsAllowSCEmssnsForecasting;
	public Boolean PermissionsAllowSCExpansionUseCase;
	public Boolean PermissionsAllowSCExternalEngMgmt;
	public Boolean PermissionsAllowSCSNGManagement;
	public Boolean PermissionsAllowSCScope3Hub;
	public Boolean PermissionsAllowSCSnGAffiliates;
	public Boolean PermissionsAllowSCTargetSetting;
	public Boolean PermissionsAllowSCWasteManagement;
	public Boolean PermissionsAllowSCWaterManagement;
	public Boolean PermissionsAllowUniversalSearch;
	public Boolean PermissionsAllowViewEditConvertedLeads;
	public Boolean PermissionsAllowViewKnowledge;
	public Boolean PermissionsAllowVisitRecommendation;
	public Boolean PermissionsAnalyticsQueryServiceConsumer;
	public Boolean PermissionsApexRestServices;
	public Boolean PermissionsApiEnabled;
	public Boolean PermissionsApiUserOnly;
	public Boolean PermissionsAppointmentBookingUserAccess;
	public Boolean PermissionsAssessmentPlatformUser;
	public Boolean PermissionsAssignPermissionSets;
	public Boolean PermissionsAssignTopics;
	public Boolean PermissionsAssociationEngineUserAccess;
	public Boolean PermissionsAuthorApex;
	public Boolean PermissionsAuthorizePayments;
	public Boolean PermissionsAutomaticActivityCapture;
	public Boolean PermissionsB2BMarketingAnalyticsUser;
	public Boolean PermissionsBREAlertsUserAccess;
	public Boolean PermissionsBVCommunityAccess;
	public Boolean PermissionsBehavioralHealthAppUserAccess;
	public Boolean PermissionsBotManageBots;
	public Boolean PermissionsBotManageBotsTrainingData;
	public Boolean PermissionsBranchManagementUserAccess;
	public Boolean PermissionsBulkApiHardDelete;
	public Boolean PermissionsBulkMacrosAllowed;
	public Boolean PermissionsBypassMFAForUiLogins;
	public Boolean PermissionsCCUserHasEAndUProgramAccess;
	public Boolean PermissionsCMSECEAuthoringAccess;
	public Boolean PermissionsCallCoachingUser;
	public Boolean PermissionsCampaignInfluence2;
	public Boolean PermissionsCanAccessCE;
	public Boolean PermissionsCanApproveFeedPost;
	public Boolean PermissionsCanEditDataPrepRecipe;
	public Boolean PermissionsCanEditPrompts;
	public Boolean PermissionsCanInitiateMessagingSessions;
	public Boolean PermissionsCanInsertFeedSystemFields;
	public Boolean PermissionsCanManageMaps;
	public Boolean PermissionsCanRunAnalysis;
	public Boolean PermissionsCanUpdateEmailMessage;
	public Boolean PermissionsCanUseNewDashboardBuilder;
	public Boolean PermissionsCanVerifyComment;
	public Boolean PermissionsCaptureAndReversePayments;
	public Boolean PermissionsChainOfCustodyUser;
	public Boolean PermissionsChangeDashboardColors;
	public Boolean PermissionsChatterComposeUiCodesnippet;
	public Boolean PermissionsChatterEditOwnPost;
	public Boolean PermissionsChatterEditOwnRecordPost;
	public Boolean PermissionsChatterFileLink;
	public Boolean PermissionsChatterInternalUser;
	public Boolean PermissionsChatterInviteExternalUsers;
	public Boolean PermissionsChatterOwnGroups;
	public Boolean PermissionsClauseDEUser;
	public Boolean PermissionsClauseDesigner;
	public Boolean PermissionsClauseUser;
	public Boolean PermissionsClientSecretRotation;
	public Boolean PermissionsCloseConversations;
	public Boolean PermissionsCombAuthAndCapPayments;
	public Boolean PermissionsComplaintsManagementAccess;
	public Boolean PermissionsConfigCompliantDataSharing;
	public Boolean PermissionsConfigCustomRecs;
	public Boolean PermissionsConfigureDataspaceScope;
	public Boolean PermissionsConfigureScopedAccessGroup;
	public Boolean PermissionsConfigureLiveMessage;
	public Boolean PermissionsConnectOrgToEnvironmentHub;
	public Boolean PermissionsConsentApiUpdate;
	public Boolean PermissionsContactCenterUserAccess;
	public Boolean PermissionsContactInspectorUser;
	public Boolean PermissionsContentAdministrator;
	public Boolean PermissionsContentHubUser;
	public Boolean PermissionsContentWorkspaces;
	public Boolean PermissionsContractorHasEUProgramAccess;
	public Boolean PermissionsContractorHasWorkReportAccess;
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
	public Boolean PermissionsCreateUpdateSDDDataset;
	public Boolean PermissionsCreateUpdateSDDStory;
	public Boolean PermissionsCreateWorkBadgeDefinition;
	public Boolean PermissionsCreateWorkspaces;
	public Boolean PermissionsCrisisCenterUserAccess;
	public Boolean PermissionsCustomAppsOnFSMobile;
	public Boolean PermissionsCustomMobileAppsAccess;
	public Boolean PermissionsCustomSidebarOnAllPages;
	public Boolean PermissionsCustomizeApplication;
	public Boolean PermissionsDCHMSO365AddInAuthor;
	public Boolean PermissionsDCHMSO365AddInDesigner;
	public Boolean PermissionsDataExport;
	public Boolean PermissionsDataPipelinesAppConsumer;
	public Boolean PermissionsDebugApex;
	public Boolean PermissionsDelegatedPortalUserAdmin;
	public Boolean PermissionsDecisionTableExecUserAccess;
	public Boolean PermissionsDeferSharingCalculations;
	public Boolean PermissionsDelegatedTwoFactor;
	public Boolean PermissionsDeleteActivatedContract;
	public Boolean PermissionsDeleteCrMemoAndInvoice;
	public Boolean PermissionsDeleteTopics;
	public Boolean PermissionsDesignContextRule;
	public Boolean PermissionsDigitalLendingAdminUser;
	public Boolean PermissionsDigitalLendingEditReadOnly;
	public Boolean PermissionsDigitalLendingUser;
	public Boolean PermissionsDigitalLendingWorkbench;
	public Boolean PermissionsDistributeFromPersWksp;
	public Boolean PermissionsDivisionAffected;
	public Boolean PermissionsDocGenDesigner;
	public Boolean PermissionsDocGenRuntimeCCUser;
	public Boolean PermissionsDocGenRuntimeUser;
	public Boolean PermissionsDocumentAutomationUserAccess;
	public Boolean PermissionsDocumentChecklistUserAccess;
	public Boolean PermissionsDocumentWorkspaceCmtyAccess;
	public Boolean PermissionsDocumentWorkspaceUserAccess;
	public Boolean PermissionsDownloadPackageVersionZips;
	public Boolean PermissionsEditActivatedOrders;
	public Boolean PermissionsEditBillingInfo;
	public Boolean PermissionsEditBrandTemplates;
	public Boolean PermissionsEditBuildingEnergyIntensity;
	public Boolean PermissionsEditCaseComments;
	public Boolean PermissionsEditEvent;
	public Boolean PermissionsEditHtmlTemplates;
	public Boolean PermissionsEditKnowledge;
	public Boolean PermissionsEditMaterialityAssessment;
	public Boolean PermissionsEditMyDashboards;
	public Boolean PermissionsEditMyReports;
	public Boolean PermissionsEditOppLineItemUnitPrice;
	public Boolean PermissionsEditPublicDocuments;
	public Boolean PermissionsEditPublicFilters;
	public Boolean PermissionsEditPublicTemplates;
	public Boolean PermissionsEditReadonlyFields;
	public Boolean PermissionsEditRepricing;
	public Boolean PermissionsEditTask;
	public Boolean PermissionsEditTopics;
	public Boolean PermissionsEmailAdministration;
	public Boolean PermissionsEmailMass;
	public Boolean PermissionsEmailSingle;
	public Boolean PermissionsEmailTemplateManagement;
	public Boolean PermissionsEmbeddedMessagingAgent;
	public Boolean PermissionsEnableAssignCrbnFtprntToEur;
	public Boolean PermissionsEnableAutoCreateCrbnFtprnts;
	public Boolean PermissionsEnableBCTransactionPolling;
	public Boolean PermissionsEnableCommunityAppLauncher;
	public Boolean PermissionsEnableIPFSUpload;
	public Boolean PermissionsEnableImpCSVForMfgAAFCmty;
	public Boolean PermissionsEnableMassUpdtForMfgAAFCmty;
	public Boolean PermissionsEnableMassUpdtForMfgSACmty;
	public Boolean PermissionsEnableNotifications;
	public Boolean PermissionsEnforceMutualAuthentication;
	public Boolean PermissionsExecuteDSARPolicies;
	public Boolean PermissionsExplainabilityCmtyAccess;
	public Boolean PermissionsExplainabilityUserAccess;
	public Boolean PermissionsExportCalculations;
	public Boolean PermissionsExportReport;
	public Boolean PermissionsFHIRCmtyAccess;
	public Boolean PermissionsFSCAlertFrameworkUserAccess;
	public Boolean PermissionsFSCArcGraphCommunityUser;
	public Boolean PermissionsFSCB2BUserAccess;
	public Boolean PermissionsFSCInsClaimMgmtPlatformUser;
	public Boolean PermissionsFSCInsPolicyAdminPlatformUser;
	public Boolean PermissionsFSCInsuranceCmpCmtyAccess;
	public Boolean PermissionsFSCInsuranceCmpLexOnlyAccess;
	public Boolean PermissionsFSCInsurancePlatformUser;
	public Boolean PermissionsFeedPinning;
	public Boolean PermissionsFieldServiceAccess;
	public Boolean PermissionsFieldServiceDispatcher;
	public Boolean PermissionsFieldServiceLastMile;
	public Boolean PermissionsFieldServiceMobileApp;
	public Boolean PermissionsFieldServiceScheduling;
	public Boolean PermissionsFinancialServices2UserAccess;
	public Boolean PermissionsFlowUFLRequired;
	public Boolean PermissionsForceTwoFactor;
	public Boolean PermissionsFreezeUsers;
	public Boolean PermissionsFscPlansAndGoalsUser;
	public Boolean PermissionsFundraisingUser;
	public Boolean PermissionsGetSmartDataDiscovery;
	public Boolean PermissionsGetSmartDataDiscoveryExternal;
	public Boolean PermissionsGiveRecognitionBadge;
	public Boolean PermissionsGovernNetworks;
	public Boolean PermissionsHCMedTherapyMgmtUser;
	public Boolean PermissionsHasUnlimitedErbScoringRequests;
	public Boolean PermissionsHasUnlimitedNBAExecutions;
	public Boolean PermissionsHcAdvancedTherapyUser;
	public Boolean PermissionsHcMedReconciliationUser;
	public Boolean PermissionsHcPnmSiteUser;
	public Boolean PermissionsHeadlessCMSAccess;
	public Boolean PermissionsHealthCloudCmtyAccess;
	public Boolean PermissionsHealthCloudUtilizationMgmtUser;
	public Boolean PermissionsHideReadByList;
	public Boolean PermissionsIcmCmtyAccess;
	public Boolean PermissionsIdentityConnect;
	public Boolean PermissionsIdentityEnabled;
	public Boolean PermissionsIdentityVerificationUserAccess;
	public Boolean PermissionsImportCustomObjects;
	public Boolean PermissionsImportLeads;
	public Boolean PermissionsImportPersonal;
	public Boolean PermissionsIndustriesEpcNextPilot;
	public Boolean PermissionsIndustryMilestonePlatformUser;
	public Boolean PermissionsInsightsAppAdmin;
	public Boolean PermissionsInsightsAppDashboardEditor;
	public Boolean PermissionsInsightsAppEltEditor;
	public Boolean PermissionsInsightsAppUploadUser;
	public Boolean PermissionsInsightsAppUser;
	public Boolean PermissionsInsightsCreateApplication;
	public Boolean PermissionsInstallDEIAnalyticsApp;
	public Boolean PermissionsInstallNetZeroAnalyticsApp;
	public Boolean PermissionsInstallPackaging;
	public Boolean PermissionsInsuranceGroupBenefitsUser;
	public Boolean PermissionsInteractionCalcAdminPerm;
	public Boolean PermissionsInteractionCalcUserPerm;
	public Boolean PermissionsInterestTaggingUserAccess;
	public Boolean PermissionsIotUser;
	public Boolean PermissionsIsSsoEnabled;
	public Boolean PermissionsIsotopeAccess;
	public Boolean PermissionsIsotopeCToCUser;
	public Boolean PermissionsIsotopeLEX;
	public Boolean PermissionsKycPlatformUser;
	public Boolean PermissionsLMEndMessagingSessionUserPerm;
	public Boolean PermissionsLMOutboundMessagingUserPerm;
	public Boolean PermissionsLearningManager;
	public Boolean PermissionsLPICommunityAccess;
	public Boolean PermissionsLeadInspectorUser;
	public Boolean PermissionsLeadScoreResultPublisher;
	public Boolean PermissionsLeadScoreUser;
	public Boolean PermissionsLifecycleManagementAPIUser;
	public Boolean PermissionsLightningConsoleAllowedForUser;
	public Boolean PermissionsLightningExperienceUser;
	public Boolean PermissionsLightningOnFSMobile;
	public Boolean PermissionsLightningSchedulerUserAccess;
	public Boolean PermissionsListEmailSend;
	public Boolean PermissionsLoanOfficerUser;
	public Boolean PermissionsLiveMessageAgent;
	public Boolean PermissionsLobbyManagementUserAccess;
	public Boolean PermissionsLtngPromoReserved01UserPerm;
	public Boolean PermissionsMakePayments;
	public Boolean PermissionsManageAccessPolicies;
	public Boolean PermissionsManageAnalyticSnapshots;
	public Boolean PermissionsManageAuthProviders;
	public Boolean PermissionsManageBusinessHourHolidays;
	public Boolean PermissionsManageC2CHighVolumePriming;
	public Boolean PermissionsManageC360AConnections;
	public Boolean PermissionsManageCGAnalytics;
	public Boolean PermissionsManageCLMAnalytics;
	public Boolean PermissionsManageCMS;
	public Boolean PermissionsManageCallCenters;
	public Boolean PermissionsManageCases;
	public Boolean PermissionsManageCategories;
	public Boolean PermissionsManageCertificates;
	public Boolean PermissionsManageCertificatesExpiration;
	public Boolean PermissionsManageChatterMessages;
	public Boolean PermissionsManageContentPermissions;
	public Boolean PermissionsManageContentProperties;
	public Boolean PermissionsManageContentTypes;
	public Boolean PermissionsManageConvMiningReports;
	public Boolean PermissionsManageCssUsers;
	public Boolean PermissionsManageCustomDomains;
	public Boolean PermissionsManageCustomPermissions;
	public Boolean PermissionsManageCustomReportTypes;
	public Boolean PermissionsManageCustomerExperienceAnalytics;
	public Boolean PermissionsManageDSARPolicies;
	public Boolean PermissionsManageDashbdsInPubFolders;
	public Boolean PermissionsManageDataCategories;
	public Boolean PermissionsManageDataIntegrations;
	public Boolean PermissionsManageDataMaskPolicies;
	public Boolean PermissionsManageDataProcessingEngine;
	public Boolean PermissionsManageDataspaceScope;
	public Boolean PermissionsManageDefaultReportingYearType;
	public Boolean PermissionsManageDevices;
	public Boolean PermissionsManageDynamicDashboards;
	public Boolean PermissionsManageERMAnalytics;
	public Boolean PermissionsManageEmailClientConfig;
	public Boolean PermissionsManageEncryptionKeys;
	public Boolean PermissionsManageEntitlements;
	public Boolean PermissionsManageExchangeConfig;
	public Boolean PermissionsManageExternalConnections;
	public Boolean PermissionsManageFuelTypes;
	public Boolean PermissionsManageGlobalPrivacyCenterVO;
	public Boolean PermissionsManageHcProviderNtwkMgmt;
	public Boolean PermissionsManageHcProviderRelMgmt;
	public Boolean PermissionsManageHealthCareAnalytics;
	public Boolean PermissionsManageHealthCheck;
	public Boolean PermissionsManageHealthCloud;
	public Boolean PermissionsManageHealthCloudFinancialData;
	public Boolean PermissionsManageHubConnections;
	public Boolean PermissionsManageIndustriesVisit;
	public Boolean PermissionsManageInteraction;
	public Boolean PermissionsManageInternalUsers;
	public Boolean PermissionsManageIpAddresses;
	public Boolean PermissionsManageKnowledge;
	public Boolean PermissionsManageKnowledgeImportExport;
	public Boolean PermissionsManageLeads;
	public Boolean PermissionsManageLearningReporting;
	public Boolean PermissionsManageLoadReferenceData;
	public Boolean PermissionsManageLoginAccessPolicies;
	public Boolean PermissionsManageLoyalty;
	public Boolean PermissionsManageLoyaltyAnalytics;
	public Boolean PermissionsManageLoyaltyPrograms;
	public Boolean PermissionsManageLoyaltyPromotionsGPM;
	public Boolean PermissionsManageManufacturingAnalytics;
	public Boolean PermissionsManageMobile;
	public Boolean PermissionsManageMobileAppSecurity;
	public Boolean PermissionsManageNamedCredentials;
	public Boolean PermissionsManageNetZeroCloudSettings;
	public Boolean PermissionsManageNetworks;
	public Boolean PermissionsManageOrchInstsAndWorkItems;
	public Boolean PermissionsManageOrchestrationRuns;
	public Boolean PermissionsManagePartners;
	public Boolean PermissionsManagePasswordPolicies;
	public Boolean PermissionsManagePharmacyBenefitsVerf;
	public Boolean PermissionsManagePreferenceCenter;
	public Boolean PermissionsManagePrivacyCenterPolicies;
	public Boolean PermissionsManagePrivacyHold;
	public Boolean PermissionsManageProductCatalog;
	public Boolean PermissionsManageProductDiscovery;
	public Boolean PermissionsManageProfilesPermissionsets;
	public Boolean PermissionsManageProgramManagement;
	public Boolean PermissionsManagePromotionDistributionGPM;
	public Boolean PermissionsManagePromotionWithGPM;
	public Boolean PermissionsManagePropositions;
	public Boolean PermissionsManageProviderSearch;
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
	public Boolean PermissionsManageSmartDataDiscovery;
	public Boolean PermissionsManageSmartDataDiscoveryModel;
	public Boolean PermissionsManageSolutions;
	public Boolean PermissionsManageStores;
	public Boolean PermissionsManageSubscriptions;
	public Boolean PermissionsManageSurveys;
	public Boolean PermissionsManageSustainabilityUOM;
	public Boolean PermissionsManageSynonyms;
	public Boolean PermissionsManageTCRMforSustainability;
	public Boolean PermissionsManageTemplatedApp;
	public Boolean PermissionsManageTerritories;
	public Boolean PermissionsManageTranslation;
	public Boolean PermissionsManageTwoFactor;
	public Boolean PermissionsManageUnlistedGroups;
	public Boolean PermissionsManageUsers;
	public Boolean PermissionsManageVehicleAssetRecordTypes;
	public Boolean PermissionsMassInlineEdit;
	public Boolean PermissionsMedMgmtExperienceCloudUser;
	public Boolean PermissionsMergeTopics;
	public Boolean PermissionsMicrobatching;
	public Boolean PermissionsMngBuildingEnergyRecordTypes;
	public Boolean PermissionsMngEnrgyAttrCertCredit;
	public Boolean PermissionsMngFuelTypeSustainabilityUOM;
	public Boolean PermissionsMngStationaryAssetRecordTypes;
	public Boolean PermissionsMngSustainabilityUOConversion;
	public Boolean PermissionsMobileAppSecurity;
	public Boolean PermissionsModerateChatter;
	public Boolean PermissionsModerateNetworkFeeds;
	public Boolean PermissionsModerateNetworkFiles;
	public Boolean PermissionsModerateNetworkMessages;
	public Boolean PermissionsModerateNetworkUsers;
	public Boolean PermissionsModifyAllData;
	public Boolean PermissionsModifyDataClassification;
	public Boolean PermissionsModifyMetadata;
	public Boolean PermissionsMonitorLoginHistory;
	public Boolean PermissionsMortgageUserAccess;
	public Boolean PermissionsMultiStepSchedulingUser;
	public Boolean PermissionsMyTrailheadBranding;
	public Boolean PermissionsMyTrailheadContentAccess;
	public Boolean PermissionsMyTrailheadContentCreation;
	public Boolean PermissionsMyTrailheadCustomSteps;
	public Boolean PermissionsMyTrailheadManageCollections;
	public Boolean PermissionsMyTrailheadPreviewMode;
	public Boolean PermissionsMyTrailheadReleaseMgmt;
	public Boolean PermissionsNativeWebviewScrolling;
	public Boolean PermissionsNewReportBuilder;
	public Boolean PermissionsOmniStudioDesigner;
	public Boolean PermissionsOmniStudioRuntime;
	public Boolean PermissionsOmniStudioRuntimeCC;
	public Boolean PermissionsOmnichannelInventoryBasic;
	public Boolean PermissionsOmnichannelInventorySync;
	public Boolean PermissionsOptOutGeoLocationTracking;
	public Boolean PermissionsOverrideForecasts;
	public Boolean PermissionsPackaging2;
	public Boolean PermissionsPackaging2Delete;
	public Boolean PermissionsPackaging2PromoteVersion;
	public Boolean PermissionsPasswordNeverExpires;
	public Boolean PermissionsPaymentsAPIUser;
	public Boolean PermissionsPersonalizationIntelUser;
	public Boolean PermissionsPersonalizationPlatform;
	public Boolean PermissionsPersonalizedFinanceUserAccess;
	public Boolean PermissionsPortalSuperUser;
	public Boolean PermissionsPreventClassicExperience;
	public Boolean PermissionsPreviewExperienceUser;
	public Boolean PermissionsPrivacyDataAccess;
	public Boolean PermissionsProductAdmin;
	public Boolean PermissionsPublishPackaging;
	public Boolean PermissionsProductCatalogApiAccess;
	public Boolean PermissionsProductCatalogMgmtApiCCAccess;
	public Boolean PermissionsProductCatalogMgmtApiPCAccess;
	public Boolean PermissionsProductCatalogMgmtBaseCCUser;
	public Boolean PermissionsProductCatalogMgmtBasePCUser;
	public Boolean PermissionsProductDiscoveryUser;
	public Boolean PermissionsProviderSearchUserAccess;
	public Boolean PermissionsPublicSectorPlatformUserAccess;
	public Boolean PermissionsQueryAllFiles;
	public Boolean PermissionsQuipMetricsAccess;
	public Boolean PermissionsQuipUserEngagementMetrics;
	public Boolean PermissionsReassignOrchestrationWorkItems;
	public Boolean PermissionsRecordAggregationAccess;
	public Boolean PermissionsRecordVisibilityAPI;
	public Boolean PermissionsRefundPayments;
	public Boolean PermissionsRemoveDirectMessageMembers;
	public Boolean PermissionsResetPasswords;
	public Boolean PermissionsRunCGCloudREPackage;
	public Boolean PermissionsRunCGCloudSyncPackage;
	public Boolean PermissionsRunContextRule;
	public Boolean PermissionsRunDecisionMatrix;
	public Boolean PermissionsRunDirectStoreDelivery;
	public Boolean PermissionsRunExpressionSet;
	public Boolean PermissionsRunFlow;
	public Boolean PermissionsRunNetZeroAnalyticsRecipe;
	public Boolean PermissionsRunRegisterProcessingServices;
	public Boolean PermissionsRunReports;
	public Boolean PermissionsRunRetailExecution;
	public Boolean PermissionsSDCommunityAccess;
	public Boolean PermissionsSalesAnalyticsUser;
	public Boolean PermissionsSalesConsole;
	public Boolean PermissionsSalesforceIQInbox;
	public Boolean PermissionsSalesforceIQInternal;
	public Boolean PermissionsSandboxTestingInCommunityApp;
	public Boolean PermissionsScheduleReports;
	public Boolean PermissionsSchedulingFacilityManager;
	public Boolean PermissionsSchedulingLineAmbassador;
	public Boolean PermissionsScoringFrameworkAdmin;
	public Boolean PermissionsScoringFrameworkUser;
	public Boolean PermissionsSegmentIntelligenceUser;
	public Boolean PermissionsSelectFilesFromSalesforce;
	public Boolean PermissionsSendAnnouncementEmails;
	public Boolean PermissionsSendCustomNotifications;
	public Boolean PermissionsSendExternalEmailAvailable;
	public Boolean PermissionsSendSitRequests;
	public Boolean PermissionsServiceAnalyticsUser;
	public Boolean PermissionsShareFilesWithNetworks;
	public Boolean PermissionsServiceExcellencePlatformUser;
	public Boolean PermissionsShareInternalArticles;
	public Boolean PermissionsShareSmartDataDiscoveryStory;
	public Boolean PermissionsShowCompanyNameAsUserBadge;
	public Boolean PermissionsShowPreWorkBriefGA;
	public Boolean PermissionsSimpleCsvDataImportUser;
	public Boolean PermissionsSkipIdentityConfirmation;
	public Boolean PermissionsSlackCibUser;
	public Boolean PermissionsSmartDataDiscoveryForCommunity;
	public Boolean PermissionsSolutionImport;
	public Boolean PermissionsSonicConsumer;
	public Boolean PermissionsStageManagementDesignUser;
	public Boolean PermissionsStdAutomaticActivityCapture;
	public Boolean PermissionsStoryOnDSWithPredicate;
	public Boolean PermissionsSubmitMacrosAllowed;
	public Boolean PermissionsSubscribeDashboardRolesGrps;
	public Boolean PermissionsSubscribeDashboardToOtherUsers;
	public Boolean PermissionsSubscribeReportRolesGrps;
	public Boolean PermissionsSubscribeReportToOtherUsers;
	public Boolean PermissionsSubscribeReportsRunAsUser;
	public Boolean PermissionsSubscribeToLightningDashboards;
	public Boolean PermissionsSubscribeToLightningReports;
	public Boolean PermissionsSustainabilityUserPermission;
	public Boolean PermissionsTraceXdsQueries;
	public Boolean PermissionsTransactionSecurityExempt;
	public Boolean PermissionsTransactionalEmailSend;
	public Boolean PermissionsTransferAnyCase;
	public Boolean PermissionsTransferAnyEntity;
	public Boolean PermissionsTransferAnyLead;
	public Boolean PermissionsTwoFactorApi;
	public Boolean PermissionsUnderwriterUser;
	public Boolean PermissionsUpdateDEIAnalyticsApp;
	public Boolean PermissionsUpdateNetZeroAnalyticsApp;
	public Boolean PermissionsUpldNetZeroAnlytBusMetricsData;
	public Boolean PermissionsUpldNetZeroAnlytEfcyFctorData;
	public Boolean PermissionsUpldNetZeroAnlytInitSavData;
	public Boolean PermissionsUpldNetZeroAnlytRenewableData;
	public Boolean PermissionsUploadDEIAnalyticsData;
	public Boolean PermissionsUseAddAdjustment;
	public Boolean PermissionsUseAddOrderItemSummary;
	public Boolean PermissionsUseAddOrderItemSummaryAPIs;
	public Boolean PermissionsUseAssistantDialog;
	public Boolean PermissionsUseCGAnalytics;
	public Boolean PermissionsUseCLMAnalytics;
	public Boolean PermissionsUseCompliantDataSharing;
	public Boolean PermissionsUseCreateCreditMemo;
	public Boolean PermissionsUseCreateOrderSummary;
	public Boolean PermissionsUseCustomerExperienceAnalytics;
	public Boolean PermissionsUseERMAnalytics;
	public Boolean PermissionsUseEnsureFunds;
	public Boolean PermissionsUseExchangesAPIs;
	public Boolean PermissionsUseExpCloudCBSF;
	public Boolean PermissionsUseFulfillmentAPIs;
	public Boolean PermissionsUseHealthCareAnalytics;
	public Boolean PermissionsUseLoyaltyAnalytics;
	public Boolean PermissionsUseManufacturingAnalytics;
	public Boolean PermissionsUseMfgAdvAcctForecastCmty;
	public Boolean PermissionsUseMfgSalesAgreementsCmty;
	public Boolean PermissionsUseMySearch;
	public Boolean PermissionsUseOMAnalytics;
	public Boolean PermissionsUseOmnichannelInventoryAPIs;
	public Boolean PermissionsUseOrderEntry;
	public Boolean PermissionsUseOrderItemSummaryCancel;
	public Boolean PermissionsUseOrderItemSummaryReturn;
	public Boolean PermissionsUseQuerySuggestions;
	public Boolean PermissionsUseRegisterGuestBuyerAPI;
	public Boolean PermissionsUseRepricing;
	public Boolean PermissionsUseReturnOrder;
	public Boolean PermissionsUseReturnOrderAPIs;
	public Boolean PermissionsUseRouting;
	public Boolean PermissionsUseSmartDataDiscovery;
	public Boolean PermissionsUseSubscriptionEmails;
	public Boolean PermissionsUseTCRMforSustainability;
	public Boolean PermissionsUseTeamReassignWizards;
	public Boolean PermissionsUseTemplatedApp;
	public Boolean PermissionsUseWebLink;
	public Boolean PermissionsUserCanAccessNLPResult;
	public Boolean PermissionsUserCanPerformNLPOperation;
	public Boolean PermissionsUserHasEAndUProgramAccess;
	public Boolean PermissionsUserHasUsageImpactAccess;
	public Boolean PermissionsUserHasWorkReportAccess;
	public Boolean PermissionsUtilMgmtExperienceCloudUser;
	public Boolean PermissionsUtilMgmtProviderExprcCloudUser;
	public Boolean PermissionsUtilizationMgmtProviderUser;
	public Boolean PermissionsVideoConferenceMeetUser;
	public Boolean PermissionsVideoConferenceTeamsUser;
	public Boolean PermissionsVideoConferenceZoomUser;
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
	public Boolean PermissionsViewDevices;
	public Boolean PermissionsViewEncryptedData;
	public Boolean PermissionsViewEventLogFiles;
	public Boolean PermissionsViewGlobalHeader;
	public Boolean PermissionsViewHealthCheck;
	public Boolean PermissionsViewHelpLink;
	public Boolean PermissionsViewMLModels;
	public Boolean PermissionsViewMyTeamsDashboards;
	public Boolean PermissionsViewOnlyEmbeddedAppUser;
	public Boolean PermissionsViewPayments;
	public Boolean PermissionsViewPlatformEvents;
	public Boolean PermissionsViewPrivateStaticResources;
	public Boolean PermissionsViewProductCatalogObjects;
	public Boolean PermissionsViewPublicDashboards;
	public Boolean PermissionsViewPublicReports;
	public Boolean PermissionsViewRestrictionAndScopingRules;
	public Boolean PermissionsViewRoles;
	public Boolean PermissionsViewSecurityCommandCenter;
	public Boolean PermissionsViewSetup;
	public Boolean PermissionsViewUserPII;
	public Boolean PermissionsWaveCommunityUser;
	public Boolean PermissionsWaveManagePrivateAssetsUser;
	public Boolean PermissionsWaveTabularDownload;
	public Boolean PermissionsWorkCalibrationUser;
	public Boolean PermissionsWorkDotComUserPerm;
	public Boolean PermissionsWorkplaceCommandCenter;

	public UserPermissionAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserPermissionAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserPermissionAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserPermissionAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserPermissionAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
