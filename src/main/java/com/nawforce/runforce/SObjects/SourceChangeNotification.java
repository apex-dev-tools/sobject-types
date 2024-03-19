/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SourceChangeNotification extends SObject {
	public static SObjectType$<SourceChangeNotification> SObjectType;
	public static SObjectFields$<SourceChangeNotification> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Boolean IsNameObsolete;
	public String MemberName;
	public String MemberType;
	public String ReplayId;
	public Integer RevisionNum;

	public SourceChangeNotification clone$() {throw new java.lang.UnsupportedOperationException();}
	public SourceChangeNotification clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SourceChangeNotification clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SourceChangeNotification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SourceChangeNotification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
