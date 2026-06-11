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
public class DataConctCredExpiryEvent extends SObject {
	public static SObjectType$<DataConctCredExpiryEvent> SObjectType;
	public static SObjectFields$<DataConctCredExpiryEvent> Fields;

	public Datetime ConnectionExpiryTime;
	public String ConnectionIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String ReplayId;
	public String SchemaVersion;

	public DataConctCredExpiryEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataConctCredExpiryEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataConctCredExpiryEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataConctCredExpiryEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataConctCredExpiryEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
