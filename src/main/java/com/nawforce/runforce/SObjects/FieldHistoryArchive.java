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
public class FieldHistoryArchive extends SObject {
	public static SObjectType$<FieldHistoryArchive> SObjectType;
	public static SObjectFields$<FieldHistoryArchive> Fields;

	public String ArchiveFieldName;
	public String ArchiveParentName;
	public String ArchiveParentType;
	public Datetime ArchiveTimestamp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Field;
	public String FieldHistoryType;
	public Id HistoryId;
	public SObject History;
	public Id Id;
	public Object NewValue;
	public Object OldValue;
	public Id ParentId;
	public SObject Parent;

	public FieldHistoryArchive clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldHistoryArchive clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldHistoryArchive clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldHistoryArchive clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldHistoryArchive clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
