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
public class DocProcessingStatusEvent extends SObject {
	public static SObjectType$<DocProcessingStatusEvent> SObjectType;
	public static SObjectFields$<DocProcessingStatusEvent> Fields;

	public String ApiName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public Datetime RefreshedOnDate;
	public String ReplayId;
	public String RuntimeStatus;
	public String SchemaVersion;

	public DocProcessingStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocProcessingStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocProcessingStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocProcessingStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocProcessingStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
