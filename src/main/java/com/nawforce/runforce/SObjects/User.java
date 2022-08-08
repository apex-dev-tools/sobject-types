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
public class User extends SObject {
	public static SObjectType$<User> SObjectType;
	public static SObjectFields$<User> Fields;

	public com.nawforce.runforce.System.String AboutMe;
	public Id AccountId;
	public Account Account;
	public Address Address;
	public com.nawforce.runforce.System.String Alias;
	public com.nawforce.runforce.System.String BadgeText;
	public com.nawforce.runforce.System.String BannerPhotoUrl;
	public Id CallCenterId;
	public CallCenter CallCenter;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CommunityNickname;
	public com.nawforce.runforce.System.String CompanyName;
	public Id ContactId;
	public Contact Contact;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String DefaultCurrencyIsoCode;
	public com.nawforce.runforce.System.String DefaultGroupNotificationFrequency;
	public Id DelegatedApproverId;
	public SObject DelegatedApprover;
	public com.nawforce.runforce.System.String Department;
	public com.nawforce.runforce.System.String DigestFrequency;
	public com.nawforce.runforce.System.String Division;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String EmailEncodingKey;
	public com.nawforce.runforce.System.Boolean EmailPreferencesAutoBcc;
	public com.nawforce.runforce.System.Boolean EmailPreferencesAutoBccStayInTouch;
	public com.nawforce.runforce.System.Boolean EmailPreferencesStayInTouchReminder;
	public com.nawforce.runforce.System.String EmployeeNumber;
	public com.nawforce.runforce.System.String Extension;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FederationIdentifier;
	public com.nawforce.runforce.System.String FirstName;
	public com.nawforce.runforce.System.Boolean ForecastEnabled;
	public com.nawforce.runforce.System.String FullPhotoUrl;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsExtIndicatorVisible;
	public com.nawforce.runforce.System.Boolean IsPortalEnabled;           // TODO: Only if communities?
	public com.nawforce.runforce.System.Boolean IsProfilePhotoActive;
	public com.nawforce.runforce.System.Integer JigsawImportLimitOverride;
	public com.nawforce.runforce.System.String LanguageLocaleKey;
	public Datetime LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public Datetime LastPasswordChangeDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public com.nawforce.runforce.System.String LocaleSidKey;
	public Decimal Longitude;
	public Id ManagerId;
	public User Manager;
	public com.nawforce.runforce.System.String MediumBannerPhotoUrl;
	public com.nawforce.runforce.System.String MediumPhotoUrl;
	public com.nawforce.runforce.System.String MobilePhone;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfFailedLogins;
	public Datetime OfflinePdaTrialExpirationDate;
	public Datetime OfflineTrialExpirationDate;
	public com.nawforce.runforce.System.String OutOfOfficeMessage;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public Id ProfileId;
	public Profile Profile;
	public com.nawforce.runforce.System.Boolean ReceivesAdminInfoEmails;
	public com.nawforce.runforce.System.Boolean ReceivesInfoEmails;
	public com.nawforce.runforce.System.String SenderEmail;
	public com.nawforce.runforce.System.String SenderName;
	public com.nawforce.runforce.System.String Signature;
	public com.nawforce.runforce.System.String SmallBannerPhotoUrl;
	public com.nawforce.runforce.System.String SmallPhotoUrl;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String StayInTouchNote;
	public com.nawforce.runforce.System.String StayInTouchSignature;
	public com.nawforce.runforce.System.String StayInTouchSubject;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TimeZoneSidKey;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.Boolean UserPermissionsCallCenterAutoLogin;
	public com.nawforce.runforce.System.Boolean UserPermissionsInteractionUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsJigsawProspectingUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsKnowledgeUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsMarketingUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsOfflineUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsSFContentUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsSiteforceContributorUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsSiteforcePublisherUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsSupportUser;
	public com.nawforce.runforce.System.Boolean UserPermissionsWorkDotComUserFeature;
	public com.nawforce.runforce.System.Boolean UserPreferencesActivityRemindersPopup;
	public com.nawforce.runforce.System.Boolean UserPreferencesApexPagesDeveloperMode;
	public com.nawforce.runforce.System.Boolean UserPreferencesCacheDiagnostics;
	public com.nawforce.runforce.System.Boolean UserPreferencesContentEmailAsAndWhen;
	public com.nawforce.runforce.System.Boolean UserPreferencesContentNoEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesCreateLEXAppsWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisCommentAfterLikeEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisMentionsCommentEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisProfPostCommentEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableAllFeedsEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableBookmarkEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableChangeCommentEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableEndorsementEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableFeedbackEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableFileShareNotificationsForApi;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableFollowersEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableLaterCommentEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableLikeEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableMentionsPostEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableMessageEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableProfilePostEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableSharePostEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesDisableWorkEmail;
	public com.nawforce.runforce.System.Boolean UserPreferencesEnableAutoSubForFeeds;
	public com.nawforce.runforce.System.Boolean UserPreferencesEventRemindersCheckboxDefault;
	public com.nawforce.runforce.System.Boolean UserPreferencesExcludeMailAppAttachments;
	public com.nawforce.runforce.System.Boolean UserPreferencesFavoritesShowTopFavorites;
	public com.nawforce.runforce.System.Boolean UserPreferencesFavoritesWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesGlobalNavBarWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesGlobalNavGridMenuWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesHasCelebrationBadge;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideBiggerPhotoCallout;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideCSNDesktopTask;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideCSNGetChatterMobileTask;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideChatterOnboardingSplash;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideEndUserOnboardingAssistantModal;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideLegacyRetirementModal;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideLightningMigrationModal;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideS1BrowserUI;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideSecondChatterOnboardingSplash;
	public com.nawforce.runforce.System.Boolean UserPreferencesHideSfxWelcomeMat;
	public com.nawforce.runforce.System.Boolean UserPreferencesJigsawListUser;
	public com.nawforce.runforce.System.Boolean UserPreferencesLightningExperiencePreferred;
	public com.nawforce.runforce.System.Boolean UserPreferencesNativeEmailClient;
	public com.nawforce.runforce.System.Boolean UserPreferencesNewLightningReportRunPageEnabled;
	public com.nawforce.runforce.System.Boolean UserPreferencesPathAssistantCollapsed;
	public com.nawforce.runforce.System.Boolean UserPreferencesPreviewCustomTheme;
	public com.nawforce.runforce.System.Boolean UserPreferencesPreviewLightning;
	public com.nawforce.runforce.System.Boolean UserPreferencesReceiveNoNotificationsAsApprover;
	public com.nawforce.runforce.System.Boolean UserPreferencesReceiveNotificationsAsDelegatedApprover;
	public com.nawforce.runforce.System.Boolean UserPreferencesRecordHomeReservedWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesRecordHomeSectionCollapseWTShown;
	public com.nawforce.runforce.System.Boolean UserPreferencesReminderSoundOff;
	public com.nawforce.runforce.System.Boolean UserPreferencesSRHOverrideActivities;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowCityToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowCityToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowCountryToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowCountryToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowEmailToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowEmailToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowFaxToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowFaxToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowManagerToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowManagerToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowMobilePhoneToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowMobilePhoneToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowPostalCodeToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowPostalCodeToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowProfilePicToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowStateToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowStateToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowStreetAddressToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowStreetAddressToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowTitleToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowTitleToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowWorkPhoneToExternalUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesShowWorkPhoneToGuestUsers;
	public com.nawforce.runforce.System.Boolean UserPreferencesSortFeedByComment;
	public com.nawforce.runforce.System.Boolean UserPreferencesSuppressEventSFXReminders;
	public com.nawforce.runforce.System.Boolean UserPreferencesSuppressTaskSFXReminders;
	public com.nawforce.runforce.System.Boolean UserPreferencesTaskRemindersCheckboxDefault;
	public com.nawforce.runforce.System.Boolean UserPreferencesUserDebugModePref;
	public Id UserRoleId;
	public UserRole UserRole;
	public com.nawforce.runforce.System.String UserType;
	public com.nawforce.runforce.System.String Username;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public AccountCleanInfo[] AccountCleanInfoReviewers;
	public AccountUserTerritory2View[] AccountUserTerritory2Views;
	public AttachedContentDocument[] AttachedContentDocuments;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public WorkBadge[] Badges;
	public WorkCoaching[] CoachingRelationships;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactCleanInfo[] ContactCleanInfoReviewers;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Contract[] ContractsSigned;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public User[] DelegatedUsers;
	public Shipment[] DeliveredToShipments;
	public EmailMessageRelation[] EmailMessageRelations;
	public EventRelation[] EventRelations;
	public ExternalDataUserAuth[] ExternalDataUserAuths;
	public EntitySubscription[] FeedSubscriptions;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UserFeed[] Feeds;
	public WorkThanks[] GivenThanks;
	public Goal[] Goals;
	public CollaborationGroupMemberRequest[] GroupMembershipRequests;
	public CollaborationGroupMember[] GroupMemberships;
	public InstalledMobileApp[] InstalledMobileApps;
	public LeadCleanInfo[] LeadCleanInfoReviewers;
	public User[] ManagedUsers;
	public WorkCoaching[] Mentees;
	public OpportunitySplit[] OpportunitySplits;
	public OpportunityTeamMember[] OpportunityTeams;
	public OutgoingEmailRelation[] OutgoingEmailRelations;
	public OwnedContentDocument[] OwnedContentDocuments;
	public PermissionSetAssignment[] PermissionSetAssignments;
	public PermissionSetLicenseAssign[] PermissionSetLicenseAssignments;
	public UserEmailPreferredPerson[] PersonRecord;
	public ProductTransfer[] ReceivedByProductTransfers;
	public WorkFeedbackRequest[] RecipientFeedbackRequests;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkReward[] Rewards;
	public ServiceResource[] ServiceResources;
	public SessionPermSetActivation[] SessionPermSetActivations;
	public UserShare[] Shares;
	public WorkFeedbackRequest[] SubjectFeedbackRequests;
	public WorkFeedbackRequest[] SubmitFeedbackTo;
	public SurveyInvitation[] SurveyInvitations;
	public SurveySubject[] SurveySubjectEntities;
	public UndecidedEventRelation[] UndecidedEventRelations;
	public UserEntityAccess[] UserEntityAccessRights;
	public UserFieldAccess[] UserFieldAccessRights;
	public UserPreference[] UserPreferences;
	public ProfileSkillUser[] UserProfileSkillChildren;
	public ProfileSkillEndorsement[] UserProfileSkillUserEndorsements;
	public Site[] UserSites;
	public SurveyInvitation[] UserSurveyInvitations;
	public UserTeamMember[] UserTeams;
	public UserTerritory2Association[] UserTerritory2Associations;

	public User clone$() {throw new java.lang.UnsupportedOperationException();}
	public User clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public User clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public User clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public User clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
