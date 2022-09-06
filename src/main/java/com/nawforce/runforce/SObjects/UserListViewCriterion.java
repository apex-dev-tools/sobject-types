/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UserListViewCriterion extends SObject {
	public static SObjectType$<UserListViewCriterion> SObjectType;
	public static SObjectFields$<UserListViewCriterion> Fields;

	public String ColumnName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operation;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public Id UserListViewId;
	public UserListView UserListView;
	public String Value;

	public UserListViewCriterion clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserListViewCriterion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserListViewCriterion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserListViewCriterion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserListViewCriterion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
