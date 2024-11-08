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
public class UserChangeEvent extends SObject {
	public static SObjectType$<UserChangeEvent> SObjectType;
	public static SObjectFields$<UserChangeEvent> Fields;

	public String AboutMe;
	public Id AccountId;
	public Account Account;
	public Address Address;
	public String Alias;
	public Id CallCenterId;
	public CallCenter CallCenter;
	public Object ChangeEventHeader;
	public String City;
	public String CommunityNickname;
	public String CompanyName;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultCurrencyIsoCode;
	public String DefaultDivision;
	public String DefaultGroupNotificationFrequency;
	public Id DelegatedApproverId;
	public SObject DelegatedApprover;
	public String Department;
	public String DigestFrequency;
	public String Division;
	public String Email;
	public String EmailEncodingKey;
	public Boolean EmailPreferencesAutoBcc;
	public Boolean EmailPreferencesAutoBccStayInTouch;
	public Boolean EmailPreferencesStayInTouchReminder;
	public String EmployeeNumber;
	public String Extension;
	public String Fax;
	public String FederationIdentifier;
	public String FirstName;
	public Boolean ForecastEnabled;
	public String GeocodeAccuracy;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public Boolean IsActive;
	public Boolean IsProfilePhotoActive;
	public Integer JigsawImportLimitOverride;
	public String LanguageLocaleKey;
	public Datetime LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastPasswordChangeDate;
	public Decimal Latitude;
	public String LocaleSidKey;
	public Decimal Longitude;
	public Id ManagerId;
	public User Manager;
	public String MobilePhone;
	public String Name;
	public Integer NumberOfFailedLogins;
	public Datetime OfflinePdaTrialExpirationDate;
	public Datetime OfflineTrialExpirationDate;
	public String Phone;
	public String PostalCode;
	public Id ProfileId;
	public Profile Profile;
	public Boolean ReceivesAdminInfoEmails;
	public Boolean ReceivesInfoEmails;
	public String ReplayId;
	public String SenderEmail;
	public String SenderName;
	public String Signature;
	public String State;
	public String StateCode;
	public String StayInTouchNote;
	public String StayInTouchSignature;
	public String StayInTouchSubject;
	public String Street;
	public String TimeZoneSidKey;
	public String Title;
	public Boolean UserPermissionsCallCenterAutoLogin;
	public Boolean UserPermissionsInteractionUser;
	public Boolean UserPermissionsJigsawProspectingUser;
	public Boolean UserPermissionsKnowledgeUser;
	public Boolean UserPermissionsMarketingUser;
	public Boolean UserPermissionsOfflineUser;
	public Boolean UserPermissionsSFContentUser;
	public Boolean UserPermissionsSiteforceContributorUser;
	public Boolean UserPermissionsSiteforcePublisherUser;
	public Boolean UserPermissionsSupportUser;
	public Boolean UserPermissionsWorkDotComUserFeature;
	public Boolean UserPreferencesActionLauncherEinsteinGptConsent;
	public Boolean UserPreferencesActivityRemindersPopup;
	public Boolean UserPreferencesApexPagesDeveloperMode;
	public Boolean UserPreferencesAssistiveActionsEnabledInActionLauncher;
	public Boolean UserPreferencesBRELookupTableWelcomeMat;
	public Boolean UserPreferencesCacheDiagnostics;
	public Boolean UserPreferencesContentEmailAsAndWhen;
	public Boolean UserPreferencesContentNoEmail;
	public Boolean UserPreferencesCreateLEXAppsWTShown;
	public Boolean UserPreferencesDisCommentAfterLikeEmail;
	public Boolean UserPreferencesDisMentionsCommentEmail;
	public Boolean UserPreferencesDisProfPostCommentEmail;
	public Boolean UserPreferencesDisableAllFeedsEmail;
	public Boolean UserPreferencesDisableBookmarkEmail;
	public Boolean UserPreferencesDisableChangeCommentEmail;
	public Boolean UserPreferencesDisableEndorsementEmail;
	public Boolean UserPreferencesDisableFeedbackEmail;
	public Boolean UserPreferencesDisableFileShareNotificationsForApi;
	public Boolean UserPreferencesDisableFollowersEmail;
	public Boolean UserPreferencesDisableLaterCommentEmail;
	public Boolean UserPreferencesDisableLikeEmail;
	public Boolean UserPreferencesDisableMentionsPostEmail;
	public Boolean UserPreferencesDisableMessageEmail;
	public Boolean UserPreferencesDisableProfilePostEmail;
	public Boolean UserPreferencesDisableSharePostEmail;
	public Boolean UserPreferencesDisableWorkEmail;
	public Boolean UserPreferencesEnableAutoSubForFeeds;
	public Boolean UserPreferencesEventRemindersCheckboxDefault;
	public Boolean UserPreferencesExcludeMailAppAttachments;
	public Boolean UserPreferencesFavoritesShowTopFavorites;
	public Boolean UserPreferencesFavoritesWTShown;
	public Boolean UserPreferencesGlobalNavBarWTShown;
	public Boolean UserPreferencesGlobalNavGridMenuWTShown;
	public Boolean UserPreferencesHasCelebrationBadge;
	public Boolean UserPreferencesHasSentWarningEmail;
	public Boolean UserPreferencesHasSentWarningEmail238;
	public Boolean UserPreferencesHasSentWarningEmail240;
	public Boolean UserPreferencesHideBiggerPhotoCallout;
	public Boolean UserPreferencesHideCSNDesktopTask;
	public Boolean UserPreferencesHideCSNGetChatterMobileTask;
	public Boolean UserPreferencesHideChatterOnboardingSplash;
	public Boolean UserPreferencesHideEndUserOnboardingAssistantModal;
	public Boolean UserPreferencesHideLegacyRetirementModal;
	public Boolean UserPreferencesHideLightningMigrationModal;
	public Boolean UserPreferencesHideS1BrowserUI;
	public Boolean UserPreferencesHideSecondChatterOnboardingSplash;
	public Boolean UserPreferencesHideSfxWelcomeMat;
	public Boolean UserPreferencesJigsawListUser;
	public Boolean UserPreferencesLightningExperiencePreferred;
	public Boolean UserPreferencesLiveAgentMiawSetupDeflection;
	public Boolean UserPreferencesNativeEmailClient;
	public Boolean UserPreferencesNewLightningReportRunPageEnabled;
	public Boolean UserPreferencesPathAssistantCollapsed;
	public Boolean UserPreferencesPreviewCustomTheme;
	public Boolean UserPreferencesPreviewLightning;
	public Boolean UserPreferencesReceiveNoNotificationsAsApprover;
	public Boolean UserPreferencesReceiveNotificationsAsDelegatedApprover;
	public Boolean UserPreferencesRecordHomeReservedWTShown;
	public Boolean UserPreferencesRecordHomeSectionCollapseWTShown;
	public Boolean UserPreferencesReminderSoundOff;
	public Boolean UserPreferencesReverseOpenActivitiesView;
	public Boolean UserPreferencesSRHOverrideActivities;
	public Boolean UserPreferencesSendListEmailThroughExternalService;
	public Boolean UserPreferencesShowCityToExternalUsers;
	public Boolean UserPreferencesShowCityToGuestUsers;
	public Boolean UserPreferencesShowCountryToExternalUsers;
	public Boolean UserPreferencesShowCountryToGuestUsers;
	public Boolean UserPreferencesShowEmailToExternalUsers;
	public Boolean UserPreferencesShowEmailToGuestUsers;
	public Boolean UserPreferencesShowFaxToExternalUsers;
	public Boolean UserPreferencesShowFaxToGuestUsers;
	public Boolean UserPreferencesShowForecastingChangeSignals;
	public Boolean UserPreferencesShowForecastingRoundedAmounts;
	public Boolean UserPreferencesShowManagerToExternalUsers;
	public Boolean UserPreferencesShowManagerToGuestUsers;
	public Boolean UserPreferencesShowMobilePhoneToExternalUsers;
	public Boolean UserPreferencesShowMobilePhoneToGuestUsers;
	public Boolean UserPreferencesShowPostalCodeToExternalUsers;
	public Boolean UserPreferencesShowPostalCodeToGuestUsers;
	public Boolean UserPreferencesShowProfilePicToGuestUsers;
	public Boolean UserPreferencesShowStateToExternalUsers;
	public Boolean UserPreferencesShowStateToGuestUsers;
	public Boolean UserPreferencesShowStreetAddressToExternalUsers;
	public Boolean UserPreferencesShowStreetAddressToGuestUsers;
	public Boolean UserPreferencesShowTerritoryTimeZoneShifts;
	public Boolean UserPreferencesShowTitleToExternalUsers;
	public Boolean UserPreferencesShowTitleToGuestUsers;
	public Boolean UserPreferencesShowWorkPhoneToExternalUsers;
	public Boolean UserPreferencesShowWorkPhoneToGuestUsers;
	public Boolean UserPreferencesSortFeedByComment;
	public Boolean UserPreferencesSuppressEventSFXReminders;
	public Boolean UserPreferencesSuppressTaskSFXReminders;
	public Boolean UserPreferencesTaskRemindersCheckboxDefault;
	public Boolean UserPreferencesUserDebugModePref;
	public Id UserRoleId;
	public UserRole UserRole;
	public String UserType;
	public String Username;

	public UserChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
