/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConversationVendorInfo extends SObject {
	public static SObjectType$<ConversationVendorInfo> SObjectType;
	public static SObjectFields$<ConversationVendorInfo> Fields;

	public String BridgeComponent;
	public Boolean CapabilitiesSupportsAgentSSO;
	public Boolean CapabilitiesSupportsEinsteinConversationInsights;
	public Boolean CapabilitiesSupportsIntelligence;
	public Boolean CapabilitiesSupportsKeyProvisioning;
	public Boolean CapabilitiesSupportsNamedCredential;
	public Boolean CapabilitiesSupportsPartnerContactCenterList;
	public Boolean CapabilitiesSupportsPartnerPhoneNumbers;
	public Boolean CapabilitiesSupportsPartnerTransferDestinations;
	public Boolean CapabilitiesSupportsQueueManagement;
	public Boolean CapabilitiesSupportsUniversalCallRecordingAccess;
	public Boolean CapabilitiesSupportsUserSyncing;
	public String ConnectorUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CustomIconId;
	public StaticResource CustomIcon;
	public String CustomLoginUrl;
	public String DeveloperName;
	public Id Id;
	public Id IntegrationClassId;
	public ApexClass IntegrationClass;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id NamedCredentialId;
	public NamedCredential NamedCredential;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String TelephonySettingsComponent;
	public String VendorType;

	public ConversationVendorInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationVendorInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationVendorInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationVendorInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationVendorInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
