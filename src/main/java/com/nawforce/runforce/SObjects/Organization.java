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
public class Organization extends SObject {
	public static SObjectType$<Organization> SObjectType;
	public static SObjectFields$<Organization> Fields;

	public Address Address;
	public String City;
	public String ComplianceBccEmail;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultAccountAccess;
	public String DefaultCalendarAccess;
	public String DefaultCampaignAccess;
	public String DefaultCaseAccess;
	public String DefaultContactAccess;
	public String DefaultLeadAccess;
	public String DefaultLocaleSidKey;
	public String DefaultOpportunityAccess;
	public String DefaultPricebookAccess;
	public String DelegatedAuthenticationServiceUrl;
	public String Division;
	public String Fax;
	public Integer FiscalYearStartMonth;
	public String GeocodeAccuracy;
	public Id Id;
	public String InstanceName;
	public Boolean IsReadOnly;
	public Boolean IsSandbox;
	public String LanguageLocaleKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Integer MonthlyPageViewsEntitlement;
	public Integer MonthlyPageViewsUsed;
	public String Name;
	public String NamespacePrefix;
	public Integer NumKnowledgeService;
	public String OrganizationType;
	public String Phone;
	public String PostalCode;
	public Boolean PreferencesAutoSelectIndividualOnMerge;
	public Boolean PreferencesConsentManagementEnabled;
	public Boolean PreferencesEmailSenderIdCompliance;
	public Boolean PreferencesLightningLoginEnabled;
	public Boolean PreferencesOnlyLLPermUserAllowed;
	public Boolean PreferencesRequireOpportunityProducts;
	public Boolean PreferencesTerminateOldestSession;
	public Boolean PreferencesTransactionSecurityPolicy;
	public String PrimaryContact;
	public Boolean ReceivesAdminInfoEmails;
	public Boolean ReceivesInfoEmails;
	public String SignupCountryIsoCode;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String TimeZoneSidKey;
	public Datetime TrialExpirationDate;
	public String UiSkin;
	public Boolean UsesStartDateAsFiscalYearName;
	public String WebToCaseDefaultOrigin;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CustomBrand[] CustomBrands;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public OmniInteractionAccessConfig[] OmniInteractionAccessConfigs;

	public Organization clone$() {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
