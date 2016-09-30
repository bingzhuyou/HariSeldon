<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/public/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href=" <%=basePath%>">
<%@ include file="/WEB-INF/page/public/headInc.jsp"%>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<%@ include file="/WEB-INF/page/menu/MainHeader.jsp"%>
	<%@ include file="/WEB-INF/page/menu/MainSideBar.jsp"%>
	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>Dashboard <small>Version 2.0</small></h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li class="active">Dashboard</li>
			</ol>
		</section>
		<!-- Main content -->
		<section class="content">
			<div class="table-panel">
				<div class="table-controls">
					<div class="btn-group actions-menu-for-selected pull-left"
						data-bind="visible: hasEntries" style="display: none;">
						<a href="#" aria-haspopup="true" class=" btn dropdown-toggle"
							data-toggle="dropdown"> <i aria-hidden="true" class=""></i> <span
							class="dropdown-text">Actions for Selected <span
								class="count"></span></span> <b aria-hidden="true" class="caret"></b>
						</a>
					</div>
					<div class="pull-left info-text"
						data-bind="visible: notAllSelectedText().length > 0 && hiddenSelectedText().length === 0,
             text: notAllSelectedText,
             click: selectAllEntries"
						style="display: none;"></div>
					<div class="pull-left info-text"
						data-bind="visible: hiddenSelectedText().length > 0,
             text: hiddenSelectedText,
             click: deselectHiddenEntries"
						style="display: none;"></div>
					<div data-bind="visible: loaded" class="pull-right"
						style="display: none;">
						Columns: <select class="multiselect" multiple="multiple"
							style="display: none;"
							data-bind="
            options: availableColumns,
            optionsText: 'name',
            optionsValue: 'id',
            selectedOptions: selectedColumns,
            multiselect: {
              nonSelectedText: 'None Selected',
              nSelectedText: ' Selected',
              allSelectedText: 'All Selected',
              selectedClass: 'multiselect-selected'
            }">
						</select>
					</div>
				</div>
				<div class="table-box-dynamic">
					<table class="table table-striped no-margin hosts-table">
						<thead>
							<tr>
								<th class="table-checkbox"><input type="checkbox"
									title="Select All Rows"
									data-bind="enable: hasEntries, checked: toggleAllVisibleEntries"></th>
								<!-- ko foreach: $root.selectedColumns -->
								<th
									data-bind="dynamicHeader: {
              columnDefinitions: $root.availableColumns,
              activeColumns: $root.selectedColumns,
              primarySortColumnId: 'NAME',
              poLoaded: $root.loaded,
              poViewAccessor: $root.getPouroverView,
              gaCategory: $root.analyticsCategory
            }"></th>
								<!-- /ko -->
							</tr>
						</thead>
						<tbody>
							<tr data-bind="visible: !loaded()">
								<td colspan="20"><p>
										<i data-bind="spinner: { spin: !loaded() }"></i> Loading...
									</p></td>
							</tr>
							<tr
								data-bind="visible: loaded() && !hasEntries() && !responseWasError()"
								style="display: none;">
								<td colspan="20"><p>No hosts found.</p></td>
							</tr>
							<tr data-bind="visible: loaded() && responseWasError()"
								style="display: none;">
								<td colspan="20"><p data-bind="text: errorMessage"></p></td>
							</tr>
							<!-- ko foreach: filteredEntries -->
							<tr data-bind="visible: $root.hasEntries()"
								style="display: none;">
								<td class="table-checkbox" style="width: 2%"><input
									type="checkbox"
									title="Click the first checkbox, hold down the Shift key and click the last checkbox to select a range."
									data-bind="value: id,
                  checked: $root.selectedEntries,
                  click: $root.checkboxClicked"></td>
								<!-- ko foreach: $root.selectedColumns -->
								<td
									data-bind="dynamicColumn: {
              columnDefinitions: $root.availableColumns,
              contentHandlers: $root.contentHandlers
            }"></td>
								<!-- /ko -->
							</tr>
							<!-- /ko -->
						</tbody>
					</table>
				</div>
				<div class="table-footer-box pagination-container text-center">
					<div class="pagination valignTop inlineBlock form-inline"
						data-bind="visible: hasEntries() && maxPageIndex() > 0"
						style="display: none;">
						<label>Display</label> <select
							class="input-mini pagination-select"
							data-bind="options: availablePageSizes, optionsText: 'displayValue', value: chosenPageSize"></select>
						<label>Per Page</label>
					</div>

					<div class="pagination inlineBlock valignTop"
						data-bind="visible: $root.hasEntries() && $root.maxPageIndex() > 0"
						style="display: none;">
						<ul>
							<li data-bind="css: { disabled: $root.currentPageIndex() < 1 }"><a
								href="#" data-bind="click: gotoFirstPage" title="First">&lt;&lt;</a></li>
							<li data-bind="css: { disabled: $root.currentPageIndex() < 1 }"><a
								href="#" data-bind="click: gotoPreviousPage" title="Previous">&lt;</a></li>
							<!-- ko foreach: getNearbyPages() -->
							<!-- ko if: $data == $root.currentPageIndex() -->
							<li class="active"><a href="#" data-bind="text: $data + 1"></a></li>
							<!-- /ko -->
							<!-- ko ifnot: $data == $root.currentPageIndex() -->
							<li><a href="#"
								data-bind="text: $data + 1, click: function() { $root.gotoPage($data) }"></a></li>
							<!-- /ko -->
							<!-- /ko -->
							<li
								data-bind="css: { disabled: $root.currentPageIndex() >= $root.maxPageIndex() }"><a
								href="#" data-bind="click: gotoNextPage" title="Next"> &gt;</a></li>
							<li
								data-bind="css: { disabled: $root.currentPageIndex() >= $root.maxPageIndex() }"><a
								href="#" data-bind="click: gotoLastPage" title="Last">
									&gt;&gt;</a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>

	<%@ include file="/WEB-INF/page/public/tailInc.jsp"%>
</body>
</html>