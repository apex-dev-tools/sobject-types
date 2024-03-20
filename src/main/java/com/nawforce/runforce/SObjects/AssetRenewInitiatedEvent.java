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
public class AssetRenewInitiatedEvent extends SObject {
	public static SObjectType$<AssetRenewInitiatedEvent> SObjectType;
	public static SObjectFields$<AssetRenewInitiatedEvent> Fields;

	public AssetRenewErrorDtlEvent[] AssetRenewErrorDetailEvents;
	public String CorrelationIdentifier;
	public String EventUuid;
	public Boolean HasErrors;
	public String RenewalRecordId;
	public String ReplayId;
	public String RequestIdentifier;

	public AssetRenewInitiatedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewInitiatedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
