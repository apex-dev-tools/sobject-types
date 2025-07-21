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
public class RecordAlertActionableTargetChangeEvent extends SObject {
	public static SObjectType$<RecordAlertActionableTargetChangeEvent> SObjectType;
	public static SObjectFields$<RecordAlertActionableTargetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RecordAlertId;
	public RecordAlert RecordAlert;
	public String ReplayId;
	public String TargetObjectName;
	public String TargetRecordIdentifier;
	public String Type;

	public RecordAlertActionableTargetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAlertActionableTargetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAlertActionableTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAlertActionableTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAlertActionableTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
