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
public class SearchActivity extends SObject {
	public static SObjectType$<SearchActivity> SObjectType;
	public static SObjectFields$<SearchActivity> Fields;

	public Decimal AvgNumResults;
	public Decimal ClickRank;
	public Id ClickedRecordId;
	public Knowledge__kav ClickedRecord;
	public String ClickedRecordName;
	public Integer CountQueries;
	public Integer CountUsers;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public String KbChannel;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Period;
	public Date QueryDate;
	public String QueryLanguage;
	public String SearchTerm;
	public Datetime SystemModstamp;

	public SearchActivity clone$() {throw new java.lang.UnsupportedOperationException();}
	public SearchActivity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SearchActivity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SearchActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SearchActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
