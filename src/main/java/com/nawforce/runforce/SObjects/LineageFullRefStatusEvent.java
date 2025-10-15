/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
