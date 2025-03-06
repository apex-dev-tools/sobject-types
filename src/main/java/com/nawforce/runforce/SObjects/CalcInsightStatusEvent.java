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
public class CalcInsightStatusEvent extends SObject {
	public static SObjectType$<CalcInsightStatusEvent> SObjectType;
	public static SObjectFields$<CalcInsightStatusEvent> Fields;

	public String CalculatedInsightId;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorDetails;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public Datetime LastRunDateTime;
	public String LastRunStatus;
	public Datetime LastRunStatusDateTime;
	public String ReplayId;
	public String SchemaVersion;

	public CalcInsightStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalcInsightStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalcInsightStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalcInsightStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalcInsightStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
