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
public class Organization extends SObject {
	public static SObjectType$<Organization> SObjectType;
	public static SObjectFields$<Organization> Fields;

	public Address Address;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String ComplianceBccEmail;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DefaultAccountAccess;
	public com.nawforce.runforce.System.String DefaultCalendarAccess;
	public com.nawforce.runforce.System.String DefaultCampaignAccess;
	public com.nawforce.runforce.System.String DefaultCaseAccess;
	public com.nawforce.runforce.System.String DefaultContactAccess;
	public com.nawforce.runforce.System.String DefaultLeadAccess;
	public com.nawforce.runforce.System.String DefaultLocaleSidKey;
	public com.nawforce.runforce.System.String DefaultOpportunityAccess;
	public com.nawforce.runforce.System.String DefaultPricebookAccess;
	public com.nawforce.runforce.System.String Division;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.Integer FiscalYearStartMonth;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.String InstanceName;
	public com.nawforce.runforce.System.Boolean IsReadOnly;
	public com.nawforce.runforce.System.Boolean IsSandbox;
	public com.nawforce.runforce.System.String LanguageLocaleKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public com.nawforce.runforce.System.Integer MonthlyPageViewsEntitlement;
	public com.nawforce.runforce.System.Integer MonthlyPageViewsUsed;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.Integer NumKnowledgeService;
	public com.nawforce.runforce.System.String OrganizationType;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.Boolean PreferencesAutoSelectIndividualOnMerge;
	public com.nawforce.runforce.System.Boolean PreferencesConsentManagementEnabled;
	public com.nawforce.runforce.System.Boolean PreferencesLightningLoginEnabled;
	public com.nawforce.runforce.System.Boolean PreferencesOnlyLLPermUserAllowed;
	public com.nawforce.runforce.System.Boolean PreferencesRequireOpportunityProducts;
	public com.nawforce.runforce.System.Boolean PreferencesTerminateOldestSession;
	public com.nawforce.runforce.System.Boolean PreferencesTransactionSecurityPolicy;
	public com.nawforce.runforce.System.String PrimaryContact;
	public com.nawforce.runforce.System.Boolean ReceivesAdminInfoEmails;
	public com.nawforce.runforce.System.Boolean ReceivesInfoEmails;
	public com.nawforce.runforce.System.String SignupCountryIsoCode;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TimeZoneSidKey;
	public Datetime TrialExpirationDate;
	public com.nawforce.runforce.System.String UiSkin;
	public com.nawforce.runforce.System.Boolean UsesStartDateAsFiscalYearName;
	public com.nawforce.runforce.System.String WebToCaseDefaultOrigin;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CustomBrand[] CustomBrands;

	public Organization clone$() {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Organization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
