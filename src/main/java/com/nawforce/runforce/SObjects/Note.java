/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Note extends SObject {
	public static SObjectType$<Note> SObjectType;
	public static SObjectFields$<Note> Fields;

	public String Body;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrivate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Name Parent;
	public Datetime SystemModstamp;
	public String Title;

	public Note clone$() {throw new java.lang.UnsupportedOperationException();}
	public Note clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Note clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Note clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Note clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
