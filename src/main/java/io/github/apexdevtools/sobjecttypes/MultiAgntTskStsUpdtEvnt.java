/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MultiAgntTskStsUpdtEvnt extends SObject {
	public static SObjectType$<MultiAgntTskStsUpdtEvnt> SObjectType;
	public static SObjectFields$<MultiAgntTskStsUpdtEvnt> Fields;

	public String ContextIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String Metadata;
	public String ReplayId;
	public String Status;
	public Datetime StatusDateTime;
	public String StatusMessage;
	public String TaskIdentifier;

	public MultiAgntTskStsUpdtEvnt clone$() {throw new java.lang.UnsupportedOperationException();}
	public MultiAgntTskStsUpdtEvnt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MultiAgntTskStsUpdtEvnt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MultiAgntTskStsUpdtEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MultiAgntTskStsUpdtEvnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
