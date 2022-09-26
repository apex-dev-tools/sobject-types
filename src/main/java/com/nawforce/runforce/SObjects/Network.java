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
public class Network extends SObject {
	public static SObjectType$<Network> SObjectType;
	public static SObjectFields$<Network> Fields;

	public String AllowedExtensions;
	public Id CaseCommentEmailTemplateId;
	public EmailTemplate CaseCommentEmailTemplate;
	public Id ChangePasswordEmailTemplateId;
	public EmailTemplate ChangePasswordEmailTemplate;
	public Id ChgEmailVerNewEmailTemplateId;
	public EmailTemplate ChgEmailVerNewEmailTemplate;
	public Id ChgEmailVerOldEmailTemplateId;
	public EmailTemplate ChgEmailVerOldEmailTemplate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id DeviceActEmailTemplateId;
	public EmailTemplate DeviceActEmailTemplate;
	public Id EmailFooterLogoId;
	public Document EmailFooterLogo;
	public String EmailFooterText;
	public String EmailSenderAddress;
	public String EmailSenderName;
	public Date FirstActivationDate;
	public Id ForgotPasswordEmailTemplateId;
	public EmailTemplate ForgotPasswordEmailTemplate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LockoutEmailTemplateId;
	public EmailTemplate LockoutEmailTemplate;
	public Integer MaxFileSizeKb;
	public String Name;
	public String NewSenderAddress;
	public Boolean OptionsActionOverrideEnabled;
	public Boolean OptionsAllowInternalUserLogin;
	public Boolean OptionsAllowMembersToFlag;
	public Boolean OptionsApexCDNCachingEnabled;
	public Boolean OptionsCWBannerState;
	public Boolean OptionsDirectMessagesEnabled;
	public Boolean OptionsDisableWorkspaceInfo;
	public Boolean OptionsEinsteinAnswersEnabled;
	public Boolean OptionsEinsteinAnswersKAEnabled;
	public Boolean OptionsEinsteinAnswersQAEnabled;
	public Boolean OptionsEinsteinAnswersSnippetEnabled;
	public Boolean OptionsEnableTalkingAboutStats;
	public Boolean OptionsEnableTopicAssignmentRules;
	public Boolean OptionsExperienceBundleBasedSnaOverrideEnabled;
	public Boolean OptionsGatherCustomerSentimentData;
	public Boolean OptionsGuestChatterEnabled;
	public Boolean OptionsGuestFileAccessEnabled;
	public Boolean OptionsGuestMemberVisibility;
	public Boolean OptionsImageOptimizationCDNEnabled;
	public Boolean OptionsInvitationsEnabled;
	public Boolean OptionsKnowledgeableEnabled;
	public Boolean OptionsMemberVisibility;
	public Boolean OptionsMobileImageOptimizationEnabled;
	public Boolean OptionsNetworkSentimentAnalysis;
	public Boolean OptionsNicknameDisplayEnabled;
	public Boolean OptionsPrivateMessagesEnabled;
	public Boolean OptionsProfileBasedLayoutsForKnowledgeSearchEnabled;
	public Boolean OptionsRecognitionBadgingEnabled;
	public Boolean OptionsReputationEnabled;
	public Boolean OptionsReputationRecordConversationsDisabled;
	public Boolean OptionsSelfRegistrationEnabled;
	public Boolean OptionsSendWelcomeEmail;
	public Boolean OptionsShowAllNetworkSettings;
	public Boolean OptionsSiteAsContainerEnabled;
	public Boolean OptionsThreadedDiscussionsEnabled;
	public Boolean OptionsTopicFilteringForKnowledgeSearchEnabled;
	public Boolean OptionsTopicSuggestionsEnabled;
	public Boolean OptionsUpDownVoteEnabled;
	public Id SelfRegMicroBatchSubErrorEmailTemplateId;
	public EmailTemplate SelfRegMicroBatchSubErrorEmailTemplate;
	public Id SelfRegProfileId;
	public Profile SelfRegProfile;
	public String Status;
	public Datetime SystemModstamp;
	public String UrlPathPrefix;
	public Id VerificationEmailTemplateId;
	public EmailTemplate VerificationEmailTemplate;
	public Id WelcomeEmailTemplateId;
	public EmailTemplate WelcomeEmailTemplate;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CustomBrand[] CustomBrands;
	public NetworkActivityAudit[] NetworkActivityAudits;
	public WorkBadgeDefinition[] NetworkBadgeDefinitions;
	public WorkBadge[] NetworkBadges;
	public CollaborationGroup[] NetworkCollaborationGroups;
	public EntitySubscription[] NetworkEntitySubscriptions;
	public NetworkMember[] NetworkMembers;
	public NetworkModeration[] NetworkModerations;
	public RecommendationResponse[] NetworkRecommendationResponses;
	public Recommendation[] NetworkRecommendations;
	public WorkThanks[] NetworkThanks;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToNetwork;

	public Network clone$() {throw new java.lang.UnsupportedOperationException();}
	public Network clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Network clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Network clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Network clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
