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
public class QuickTextChangeEvent extends SObject {
	public static SObjectType$<QuickTextChangeEvent> SObjectType;
	public static SObjectFields$<QuickTextChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FolderId;
	public Folder Folder;
	public Id Id;
	public Boolean IsInsertable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceType;

	public QuickTextChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public QuickTextChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
