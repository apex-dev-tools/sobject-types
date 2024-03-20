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
public class CreateAssetOrderEvent extends SObject {
	public static SObjectType$<CreateAssetOrderEvent> SObjectType;
	public static SObjectFields$<CreateAssetOrderEvent> Fields;

	public CreateAssetOrderDtlEvent[] AssetDetails;
	public String CorrelationIdentifier;
	public String EventUuid;
	public String ReplayId;
	public String RequestIdentifier;

	public CreateAssetOrderEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
