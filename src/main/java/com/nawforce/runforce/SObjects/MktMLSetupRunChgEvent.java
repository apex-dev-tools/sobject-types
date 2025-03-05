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
public class MktMLSetupRunChgEvent extends SObject {
	public static SObjectType$<MktMLSetupRunChgEvent> SObjectType;
	public static SObjectFields$<MktMLSetupRunChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String JobRunName;
	public String ReplayId;
	public String SchemaVersion;
	public String Status;

	public MktMLSetupRunChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktMLSetupRunChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktMLSetupRunChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktMLSetupRunChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktMLSetupRunChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
