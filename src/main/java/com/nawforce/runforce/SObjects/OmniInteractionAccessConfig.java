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
public class OmniInteractionAccessConfig extends SObject {
	public static SObjectType$<OmniInteractionAccessConfig> SObjectType;
	public static SObjectFields$<OmniInteractionAccessConfig> Fields;

	public String ConfigName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsAsyncCardCachingEnabled;
	public Boolean IsCardApexRemoteDisabled;
	public Boolean IsCardCacheDisabled;
	public Boolean IsCardDataTfrmDisabled;
	public Boolean IsCardIntegrationProcDisabled;
	public Boolean IsCardRestApiDisabled;
	public Boolean IsCardSoqlDisabled;
	public Boolean IsCardSoslDisabled;
	public Boolean IsCardStreamingApiDisabled;
	public Boolean IsDataTfrmEncrpFieldsDisabled;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id SetupOwnerId;
	public Name SetupOwner;
	public Datetime SystemModstamp;

	public OmniInteractionAccessConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniInteractionAccessConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniInteractionAccessConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniInteractionAccessConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniInteractionAccessConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
