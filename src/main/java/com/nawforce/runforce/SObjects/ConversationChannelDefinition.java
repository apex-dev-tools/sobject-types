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
public class ConversationChannelDefinition extends SObject {
	public static SObjectType$<ConversationChannelDefinition> SObjectType;
	public static SObjectFields$<ConversationChannelDefinition> Fields;

	public Boolean CapabilitiesSupportsCustomChannelParameters;
	public Boolean CapabilitiesSupportsDoubleOptInConsent;
	public Boolean CapabilitiesSupportsExplicitConsent;
	public Boolean CapabilitiesSupportsImplicitConsent;
	public Boolean CapabilitiesSupportsIsoCountryCode;
	public Boolean CapabilitiesSupportsKeywords;
	public String ConnectedAppOauthLink;
	public String ConnectedAppType;
	public String ConsentOwner;
	public Id ConversationVendorInfoId;
	public ConversationVendorInfo ConversationVendorInfo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomEventPayloadField;
	public String CustomEventTypeField;
	public Id CustomIconId;
	public StaticResource CustomIcon;
	public String CustomPlatformEvent;
	public String CustomerConnectedAppOauthLink;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String RoutingOwner;
	public Datetime SystemModstamp;

	public ConversationChannelDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationChannelDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationChannelDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationChannelDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationChannelDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
