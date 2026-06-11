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
public class LineageFullRefStatusEvent extends SObject {
	public static SObjectType$<LineageFullRefStatusEvent> SObjectType;
	public static SObjectFields$<LineageFullRefStatusEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDate;
	public String EventIdentifier;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String Payload;
	public String ReplayId;
	public String SchemaVersion;

	public LineageFullRefStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LineageFullRefStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LineageFullRefStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LineageFullRefStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LineageFullRefStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
