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
public class AssetAmendInitiatedEvent extends SObject {
	public static SObjectType$<AssetAmendInitiatedEvent> SObjectType;
	public static SObjectFields$<AssetAmendInitiatedEvent> Fields;

	public String AmendmentRecordId;
	public AssetAmendErrorDtlEvent[] AssetAmendErrorDetailEvents;
	public String CorrelationIdentifier;
	public String EventUuid;
	public Boolean HasErrors;
	public String ReplayId;
	public String RequestIdentifier;

	public AssetAmendInitiatedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendInitiatedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
