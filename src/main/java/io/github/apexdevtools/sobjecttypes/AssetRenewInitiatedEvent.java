/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
