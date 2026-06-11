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
public class ContextPersistenceEvent extends SObject {
	public static SObjectType$<ContextPersistenceEvent> SObjectType;
	public static SObjectFields$<ContextPersistenceEvent> Fields;

	public String CorrelationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Boolean HasErrors;
	public String ReplayId;
	public String RequestIdentifier;

	public ContextPersistenceEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextPersistenceEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextPersistenceEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextPersistenceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextPersistenceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
