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
public class TimelineObjectDefinition extends SObject {
	public static SObjectType$<TimelineObjectDefinition> SObjectType;
	public static SObjectFields$<TimelineObjectDefinition> Fields;

	public String BaseObject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Definition;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public TimelineObjectDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimelineObjectDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimelineObjectDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimelineObjectDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimelineObjectDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
