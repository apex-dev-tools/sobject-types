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
public class ExternalSourceStatusEvent extends SObject {
	public static SObjectType$<ExternalSourceStatusEvent> SObjectType;
	public static SObjectFields$<ExternalSourceStatusEvent> Fields;

	public String Category;
	public Datetime CdpEventCreationDate;
	public Datetime CdpEventPublishDate;
	public String CdpEventType;
	public String CdpSchemaVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataLakeObjectName;
	public String ErrorCodes;
	public String ErrorMessage;
	public String EventUuid;
	public String ExternalConnectionName;
	public String ReplayId;
	public String Status;

	public ExternalSourceStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalSourceStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSourceStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSourceStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSourceStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
