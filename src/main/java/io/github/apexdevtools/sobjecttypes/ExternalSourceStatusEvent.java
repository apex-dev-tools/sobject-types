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
