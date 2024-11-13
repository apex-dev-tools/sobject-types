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
public class MultipartyInfoAuthRequestChangeEvent extends SObject {
	public static SObjectType$<MultipartyInfoAuthRequestChangeEvent> SObjectType;
	public static SObjectFields$<MultipartyInfoAuthRequestChangeEvent> Fields;

	public String AuthorizationType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String ResponseStatus;
	public Id SourceRecordId;
	public SObject SourceRecord;

	public MultipartyInfoAuthRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MultipartyInfoAuthRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MultipartyInfoAuthRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MultipartyInfoAuthRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MultipartyInfoAuthRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
