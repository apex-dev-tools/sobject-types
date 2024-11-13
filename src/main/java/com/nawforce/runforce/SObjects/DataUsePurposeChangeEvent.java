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
public class DataUsePurposeChangeEvent extends SObject {
	public static SObjectType$<DataUsePurposeChangeEvent> SObjectType;
	public static SObjectFields$<DataUsePurposeChangeEvent> Fields;

	public Boolean CanDataSubjectOptOut;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LegalBasisId;
	public DataUseLegalBasis LegalBasis;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PurposeId;
	public SObject Purpose;
	public String ReplayId;

	public DataUsePurposeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurposeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurposeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurposeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurposeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
